package com.itcast.demo;

import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:bn
 * @Date:2019/11/2619:23
 */
public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user= (User) ac.getBean("user");
        System.out.println(user);
        UserService userService=(UserService)ac.getBean("userService");
        userService.save();

    }
}
