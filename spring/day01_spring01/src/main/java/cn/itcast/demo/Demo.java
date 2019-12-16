package cn.itcast.demo;

import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:bn
 * @Date:2019/11/2614:16
 */
public class Demo {
    public static void main(String[] args) {
//        创建IOC对象容器
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
//       从IOC容器中获取bean对象
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }
}
