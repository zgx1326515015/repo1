package controller;

import com.itcast.domain.User;
import com.itcast.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther:bn
 * @Date:2019/11/2712:07
 */
public class UserController {
    private UserService userService=null;
    @Before
    public void before(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        userService=ac.getBean("userService",UserService.class);
    }
    @Test
    public void findAll(){
        List<User>list=userService.findAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    public void findById(){
        User user=userService.findById(3);
        System.out.println(user);
    }
    @Test
    public void save(){
        User user =new User();
        user.setId(3);
        user.setUsername("bunan");
        user.setPassword("123456");
        userService.save(user);
    }
    @Test
    public void deleteById(){
        userService.deleteById(3);
    }
    @Test
    public void update(){
        User user=new User();
        user.setId(3);
        user.setUsername("zhuguoxiang");
        user.setPassword("111111");
        userService.update(user);
    }
}
