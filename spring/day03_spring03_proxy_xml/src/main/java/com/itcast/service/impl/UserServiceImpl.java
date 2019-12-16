package com.itcast.service.impl;

import com.itcast.service.UserService;

/**
 * @Auther:bn
 * @Date:2019/11/2917:19
 */
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("事务体系");
    }

    @Override
    public void say() {
        int a= 1/0;
        System.out.println("事务系统");
    }

    @Override
    public void find() {
        System.out.println("排他");
    }
}
