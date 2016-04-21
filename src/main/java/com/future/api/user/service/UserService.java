
package com.future.api.user.service;

import com.future.api.user.domain.User;
import com.future.api.user.domain.UserCriteria;
import com.future.commons.service.BaseService;
import com.github.pagehelper.PageInfo;

/**
 * UserService
 *
 * @author Eric.guo
 * @date 2016/3/22 0022
 */

public interface UserService extends BaseService<User,UserCriteria> {

    PageInfo<User> getAllUsers();

}

