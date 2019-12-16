package com.itcast.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Auther:bn
 * @Date:2019/11/2918:39
 */
public class TXutils {
    public void  openTX(){
        System.out.println("开启事务");
    }
    public void submitTX(){
        System.out.println("提交事务");
    }
    public  void rollbackTX(){
        System.out.println("回滚事务");
    }
    public  void  closeTX(){
        System.out.println("关闭事务");
    }

    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕执行通知");
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
