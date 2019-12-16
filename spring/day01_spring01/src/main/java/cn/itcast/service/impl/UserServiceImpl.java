package cn.itcast.service.impl;

import cn.itcast.dao.UserDao;
import cn.itcast.service.UserService;

/**
 * @Auther:bn
 * @Date:2019/11/2614:19
 */
public class UserServiceImpl implements UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void save() {
        dao.save();
    }
}
