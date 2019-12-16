package com.itcast.demo;

import com.itcast.config.SpringConfig;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:bn
 * @Date:2019/11/2921:21
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class Demo {
    @Autowired
    private UserService us;
    @Test
    public void test(){
        us.save();
    }
}
