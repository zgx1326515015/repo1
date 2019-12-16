package com.itcast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Auther:bn
 * @Date:2019/11/2921:25
 */
@Configuration
@ComponentScan("com.itcast")
@EnableAspectJAutoProxy
public class SpringConfig {
}
