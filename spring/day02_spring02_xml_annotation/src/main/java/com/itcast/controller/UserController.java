package com.itcast.controller;

import com.itcast.domain.User;
import com.itcast.service.UserService;
import javafx.application.Application;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2720:47
 */
public class UserController {
    private UserService userService;
    @Before
    public  void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//        ApplicationContext ac=new AnnotationConfigApplicationContext("")
        userService=ac.getBean("userService",UserService.class);
    }
    @Test
    public void finAll(){
        List<User>list=userService.finAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
