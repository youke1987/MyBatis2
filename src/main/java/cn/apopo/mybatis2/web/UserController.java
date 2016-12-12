/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.mybatis2.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.apopo.mybatis2.entity.UserEntity;
import cn.apopo.mybatis2.mapper.test1.User1Mapper;
import cn.apopo.mybatis2.mapper.test2.User2Mapper;

/**
 * Created by qiaoshuang on 2016/12/12.
 */
@RestController
public class UserController {

    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/get1Users")
    public List<UserEntity> getUsers() {
        List<UserEntity> users = user1Mapper.getAll();
        return users;
    }

    @RequestMapping("/get1User")
    public UserEntity getUser(Long id) {
        UserEntity user = user1Mapper.getOne(id);
        return user;
    }

    @RequestMapping("/get2Users")
    public List<UserEntity> get2Users() {
        List<UserEntity> users = user2Mapper.getAll();
        return users;
    }

    @RequestMapping("/get2User")
    public UserEntity get2User(Long id) {
        UserEntity user = user2Mapper.getOne(id);
        return user;
    }
}
