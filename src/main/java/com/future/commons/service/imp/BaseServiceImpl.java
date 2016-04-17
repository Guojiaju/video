package com.future.commons.service.imp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.future.commons.dao.BaseDao;
import com.future.commons.domain.AbstractCriteria;
import com.future.commons.domain.AbstractEntity;
import com.future.commons.service.BaseService;
import com.future.commons.util.IdGen;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.persistence.EntityManager;


@Transactional
public abstract class BaseServiceImpl<T extends AbstractEntity, E extends AbstractCriteria>
		implements BaseService<T, E> {

	protected abstract BaseDao<T, E, String> getDao();

	protected Class<T> entityClazz;

	protected Class<E> criteriaClazz;

	@SuppressWarnings("unchecked")
	public BaseServiceImpl() {
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		entityClazz = (Class<T>) params[0];
		criteriaClazz = (Class<E>) params[1];
	}

	@Override
	public T create(T entity) {
		Assert.notNull(entity);
		String id = entity.getId() == null ? IdGen.uuid() : entity.getId()
				.trim();
		entity.setId(id);
		getDao().insertSelective(entity);
		return entity;
	}

	@Override
	public List<T> create(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(create(t));
		}
		return list;
	}

	@Override
	public T update(T entity) {
		Assert.notNull(entity);
		T existing = getDao().selectByPrimaryKey(entity.getId());
		BeanUtils.copyProperties(entity, existing);
		getDao().updateByPrimaryKeySelective(existing);
		return findOne(entity.getId());
	}

	@Override
	public List<T> update(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(update(t));
		}
		return list;
	}

	@Override
	public T save(T entity) {
		Assert.notNull(entity);
		if (entity.getId() == null) {
			create(entity);
		} else {
			update(entity);
		}
		return findOne(entity.getId());
	}

	@Override
	public List<T> save(List<T> entities) {
		Assert.notEmpty(entities);
		List<T> list = new ArrayList<T>();
		for (T t : entities) {
			list.add(save(t));
		}
		return list;
	}

	@Override
	@Transactional(readOnly = true)
	public T findOne(String id) {
		Assert.notNull(id);
		return getDao().selectByPrimaryKey(id);
	}

	@Override
	public boolean exists(String id) {
		Assert.notNull(id);
		return findOne(id) != null;
	}

	@Override
	public long count() {
		return getDao().countByExample(null);
	}

	@Override
	public void delete(String id) {
		Assert.notNull(id);
		getDao().deleteByPrimaryKey(id);
	}

	@Override
	public void delete(T entity) {
		Assert.notNull(entity);
		getDao().deleteByPrimaryKey(entity.getId());
	}

	@Override
	public void delete(List<T> entities) {
		Assert.notEmpty(entities);
		for (T t : entities) {
			delete(t);
		}
	}

	@Override
	public void deleteAll() {
		delete(findAll());
	}

	@Override
	@Transactional(readOnly = true)
	public List<T> findAll() {
		return getDao().selectByExample(null);
	}

	@Override
	@Transactional(readOnly =true)
	public List<T> search(E criteria){
		Assert.notNull(criteria);
		return getDao().selectByExample(criteria);
	}
	
	/*@Override
	@Transactional(readOnly = true)
	public List<T> findAll(Sort sort) throws Exception {
		Assert.notNull(sort);
		String orderByClause = "";
		for (Order o : sort) {
			orderByClause += " " + o.getProperty() + " "
					+ o.getDirection().toString() + " ";
		}
		E criteria = criteriaClazz.newInstance();
		criteria.setOrderByClause(orderByClause);
		return getDao().selectByExample(criteria);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<T> findAll(Pageable pageable) throws Exception {
		Assert.notNull(pageable);
		E criteria = null;
		if (pageable.getSort() != null) {
			String orderByClause = "";
			for (Order o : pageable.getSort()) {
				orderByClause += " " + o.getProperty() + " "
						+ o.getDirection().toString() + " ";
			}
			criteria = criteriaClazz.newInstance();
			criteria.setOrderByClause(orderByClause);
		}
		RowBounds rowBounds = new RowBounds(pageable.getPageNumber(),
				pageable.getPageSize());
		List<T> list = getDao().selectByExampleWithRowbounds(criteria,
				rowBounds);
		long count = count();
		return new PageImpl<T>(list, pageable, count);
	}
	
	
	
	@Override
	@Transactional(readOnly = true)
	public List<T> search(E criteria, Sort sort) {
		Assert.notNull(criteria);
		Assert.notNull(sort);
		if (sort != null) {
			String orderByClause = "";
			for (Order o : sort) {
				orderByClause += " " + o.getProperty() + " "
						+ o.getDirection().toString() + " ";
			}
			criteria.setOrderByClause(orderByClause);
		}
		return getDao().selectByExample(criteria);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<T> search(E criteria, Pageable pageable) {
		Assert.notNull(criteria);
		Assert.notNull(pageable);
		if (pageable.getSort() != null) {
			String orderByClause = "";
			for (Order o : pageable.getSort()) {
				orderByClause += " " + o.getProperty() + " "
						+ o.getDirection().toString() + " ";
			}
			criteria.setOrderByClause(orderByClause);
		}
		RowBounds rowBounds = new RowBounds(pageable.getPageNumber(),
				pageable.getPageSize());
		List<T> list = getDao().selectByExampleWithRowbounds(criteria,
				rowBounds);
		long count = count();
		return new PageImpl<T>(list, pageable, count);
	}*/

}
