package com.itcast.demo;

import com.itcast.config.ConfigSpring;
import com.itcast.service.UserService;
import com.itcast.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:bn
 * @Date:2019/11/2920:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigSpring.class})
public class Demo1 {
    @Autowired
    private UserService us;
    @Test
    public void test(){
//        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//        UserService us = ac.getBean( UserService.class);
        us.find();
    }
}
