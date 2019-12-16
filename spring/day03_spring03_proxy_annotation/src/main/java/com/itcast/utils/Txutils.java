package com.itcast.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @Auther:bn
 * @Date:2019/11/2921:21
 */
@Component
@Aspect
public class Txutils {
    @Pointcut("execution(* com.itcast.service.impl.*.*(..))")
    public  void pid(){}

    public  void open(){
        System.out.println(111);
    }
    public  void submit(){
        System.out.println(222);
    }
    public  void rollback(){
        System.out.println(333);
    }
    public  void close(){
        System.out.println(444);
    }
    @Around("pid()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object obj =null;
        try {
            open();
            obj=point.proceed();
            submit();
        } catch (Throwable throwable) {
            rollback();
        } finally {
            close();
        }
        return obj;
    }
}
