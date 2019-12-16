package demo;

import com.itcast.service.UserService;
import com.itcast.service.impl.Target;
import com.itcast.service.impl.UserSeerviceImpl;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther:bn
 * @Date:2019/11/2911:12
 */
public class Demo1 {

   @Test
    public  void test1(){
       UserSeerviceImpl usi =new UserSeerviceImpl();
//       代理目标对象的类加载器
      UserService us= (UserService)Proxy.newProxyInstance(usi.getClass().getClassLoader(),
//               代理目标对象的可能接口数组
              usi.getClass().getInterfaces(),
//              代理对象的现实处理器
              new InvocationHandler() {
                  @Override
                  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                      Object obj =null;
                      System.out.println(111);
                      obj=method.invoke(usi,args);
                      System.out.println(222);
                      return obj;
                  }
              }
      );
      us.save();
   }
    @Test
    public  void test2(){
     final    Target tg=new Target();
    Target target= (Target) Enhancer.create(Target.class, new MethodInterceptor() {
        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            Object obj=null;
            System.out.println(333);
            obj=method.invoke(tg,objects);
            System.out.println(444);
            return obj;
        }
    });
    target.say();
    }

}
