package com.itcast.service.impl;

import com.itcast.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Auther:bn
 * @Date:2019/11/2921:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("cnm");
    }
}
