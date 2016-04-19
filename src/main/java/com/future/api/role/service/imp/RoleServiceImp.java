package com.future.api.role.service.imp;

import com.future.api.role.dao.RoleMapper;
import com.future.api.role.domain.Role;
import com.future.api.role.domain.RoleCriteria;
import com.future.api.role.service.RoleService;
import com.future.commons.dao.BaseDao;
import com.future.commons.service.imp.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RoleServiceImp
 *
 * @author Eric.guo
 * @date 2016/4/13 0013
 */
@Service
public class RoleServiceImp extends BaseServiceImpl<Role,RoleCriteria> implements RoleService {

    @Autowired
    private RoleMapper roleDao;

    @Override
    protected BaseDao<Role, RoleCriteria, String> getDao() {
        return roleDao;
    }
}
