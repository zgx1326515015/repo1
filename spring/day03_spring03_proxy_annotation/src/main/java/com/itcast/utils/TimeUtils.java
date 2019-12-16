package com.itcast.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Auther:bn
 * @Date:2019/11/309:39
 */
@Component
@Aspect
public class TimeUtils {
    @Pointcut("execution(* com.itcast.service.impl.*.*(..))")
    public void pid(){}
    private Date start;
    @Before("pid()")
    public void before (){
        start=new Date();
    }
    @After("pid()")
    public void after (){
      Date  end=new Date();
      long time =end.getTime()-start.getTime();
        System.out.println(time+"毫秒");
    }
}
