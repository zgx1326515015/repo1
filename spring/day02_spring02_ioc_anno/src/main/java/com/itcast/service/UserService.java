package com.itcast.service;

import com.itcast.domain.User;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2712:02
 */
public interface UserService {
    List<User> findAll();

    User findById(int id);

    void save(User user);

    void deleteById(int id);

    void update(User user);
}
