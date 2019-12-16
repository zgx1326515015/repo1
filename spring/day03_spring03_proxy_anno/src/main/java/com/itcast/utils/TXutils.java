package com.itcast.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.beans.Expression;
import java.util.concurrent.ExecutionException;

/**
 * @Auther:bn
 * @Date:2019/11/2919:25
 */
@Component
@Aspect
public class TXutils {
    @Pointcut("execution(* com.itcast.service.impl.*.*(..))")
    public void pid(){

    }
    @Before("pid()")
    public void  openTX(){
        System.out.println("开启事务");
    }
    @AfterReturning("pid()")
    public void submitTX(){
        System.out.println("提交事务");
    }
    @AfterThrowing("pid()")
    public  void rollbackTX(){
        System.out.println("回滚事务");
    }
    @After("pid()")
    public  void  closeTX(){
        System.out.println("关闭事务");
    }
    @Around("pid()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object obj=null;
        try {
            openTX();
            obj=point.proceed();
            submitTX();
        } catch (Throwable throwable) {
            rollbackTX();
        } finally {
            closeTX();
        }
        return obj;
    }
}
