package com.hn;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class TliasWebManagementApplication {

    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        for (Object object : objects) {

        }
        SpringApplication.run(TliasWebManagementApplication.class, args);
    }

}
