package com.itcast.dao.impl;

import com.itcast.dao.UserDao;

/**
 * @Auther:bn
 * @Date:2019/11/2619:18
 */
public class UserDaoImpl implements UserDao{
    private String username;
    private Integer age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void say() {
        System.out.println("cnm");
        System.out.println(username+"----"+age);
    }
}
