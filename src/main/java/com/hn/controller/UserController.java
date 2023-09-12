package com.hn.controller;

import com.hn.mapper.UserMapper;
import com.hn.pojo.User;
import com.hn.service.UserService;
import com.hn.service.impl.UserServiceImpl;
import com.hn.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static net.sf.jsqlparser.util.validation.metadata.NamedObject.user;

/**
 * 部门管理Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    //加入用户
    @PostMapping
    public Result insertUser(User user){
        userService.inserUser(user);
        return Result.success();
    }
    //删除用户
    @DeleteMapping("/{id}")
    public Result deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return Result.success();
    }
    //查询用户
    @GetMapping("/{id}")
    public Result selectUserById(@PathVariable Integer id){
        User user = userMapper.selectById(id);
        System.out.println(user);
        return Result.success(user);
    }
    @GetMapping
    public Result selectAll(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        return Result.success(users);
    }
}
