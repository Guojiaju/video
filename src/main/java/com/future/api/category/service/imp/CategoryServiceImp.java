package com.future.api.category.service.imp;

import com.future.api.category.dao.CategoryMapper;
import com.future.api.category.domain.Category;
import com.future.api.category.domain.CategoryCriteria;
import com.future.api.category.service.CategoryService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.imp.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CategoryServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@Service
public class CategoryServiceImp extends BaseServiceImpl<Category,CategoryCriteria> implements CategoryService {

    @Autowired
    private CategoryMapper categoryDao;
    @Override
    protected BaseDao<Category, CategoryCriteria, String> getDao() {
        return categoryDao;
    }
}
