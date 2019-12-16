package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import com.itcast.service.UserService;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2712:02
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(int id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void deleteById(int id) {
        userDao.deleteById(id);
    }

    public void update(User user) {
        userDao.update(user);
    }
}
