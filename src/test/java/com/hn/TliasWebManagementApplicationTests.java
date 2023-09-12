package com.hn;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.hn.mapper.UserMapper;
import com.hn.pojo.Student;
import com.hn.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class TliasWebManagementApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }


}
