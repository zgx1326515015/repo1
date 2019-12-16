package com.itcast.dao.impl;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2712:01
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template ;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public List findAll() {
        return template.query("select * from user",new BeanPropertyRowMapper<User>(User.class));

    }

    public User findById(int id) {
        User user =null;
        try {
            user=template.queryForObject("select * from user where id = ?",new BeanPropertyRowMapper<User>(User.class),id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void save(User user) {
        template.update("insert into user values(?,?,?)",user.getId(),user.getUsername(),user.getPassword());
    }

    public void deleteById(int id) {
        template.update("delete from user where id = ?",id);
    }

    public void update(User user) {
        template.update("update user set username= ? , password = ? where id = ?",user.getUsername(),user.getPassword(),user.getId());
    }
}
