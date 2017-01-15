/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.mybatis2.mapper.test2;

import java.util.List;

import cn.apopo.springboot.mybatis2.entity.UserEntity;

/**
 * Created by qiaoshuang on 2016/12/12.
 */
public interface User2Mapper {

    List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity userEntity);

    void update(UserEntity userEntity);

    void delete(Long id);
}