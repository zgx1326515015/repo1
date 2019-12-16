package com.itcast.demo;

import com.itcast.config.Spring;
import com.itcast.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:bn
 * @Date:2019/11/3011:32
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Spring.class})
public class Demo {
    @Autowired
    private AccountService as;
    @Test
    public  void test (){

        as.account(1,2,10f);
    }
}
