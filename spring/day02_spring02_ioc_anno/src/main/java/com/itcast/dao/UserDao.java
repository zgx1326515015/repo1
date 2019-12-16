package com.itcast.dao;

import com.itcast.domain.User;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2712:01
 */
public interface UserDao {
    List findAll();

    User findById(int id);

    void save(User user);

    void deleteById(int id);

    void update(User user);
}
