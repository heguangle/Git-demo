package com.hn.service;

import com.hn.pojo.User;

/**
 * 部门管理
 */
public interface UserService {
    int inserUser(User user);

    int deleteUser(Integer id);

    User selectUserById(Integer id);
}
