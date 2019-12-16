package com.itcast.test;

import com.itcast.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:bn
 * @Date:2019/11/2918:38
 */
public class Test1 {
    @Test
    public void test1(){
      ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
        UserService us = ac.getBean("userService", UserService.class);
        us.find();
    }
}
