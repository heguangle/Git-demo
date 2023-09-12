package com.hn.service.impl;

import com.hn.mapper.UserMapper;
import com.hn.pojo.User;
import com.hn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public int inserUser(User user) {
        return userMapper.insert(user);
    }
    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public User selectUserById(Integer id) {
        return userMapper.selectById(id);
    }
}
