package com.future.api.user.service.imp;

import com.future.api.user.dao.UserMapper;
import com.future.api.user.domain.User;
import com.future.api.user.domain.UserCriteria;
import com.future.api.user.service.UserService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.imp.BaseServiceImpl;
import com.future.commons.util.PaginationContext;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * UserServiceImp
 *
 * @author Eric.guo
 * @date 2016/3/22 0022
 */
@Service
@Transactional
public class UserServiceImp extends BaseServiceImpl<User,UserCriteria> implements UserService {

    @Autowired
    private UserMapper userDao;

    @Override
    public PageInfo<User> getAllUsers() {

        PageHelper.startPage(PaginationContext.getPageNum(),PaginationContext.getPageSize());
        PageInfo<User> page = (PageInfo)this.findAll();

        return page;
    }

    @Override
    protected BaseDao<User, UserCriteria, String> getDao() {
        return userDao;
    }
}

