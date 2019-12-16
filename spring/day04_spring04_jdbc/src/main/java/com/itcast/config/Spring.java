package com.itcast.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Auther:bn
 * @Date:2019/11/3021:41
 */
@Configuration
@PropertySource("classpath:druid.properties")
@ComponentScan("com.itcast")
//@EnableAspectJAutoProxy
@EnableTransactionManagement
public class Spring {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.uri}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Bean("dataSource1")
    public DataSource getDataSource(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);//mybatis
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    @Bean("dataSource2")
    public DataSource getDataSource1(){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl("jdbc:mysql://localhost:3308/day13?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=Hongkong");
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    //定义一个方法获取JdbcTemplate对象
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(@Qualifier("dataSource1") DataSource dataSource){//默认隐藏了一个@Autowired
        return new JdbcTemplate(dataSource);
    }

    /*定义一个方法获取事务管理器对象*/
    @Bean
    public DataSourceTransactionManager getTxManager(@Qualifier("dataSource1") DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
    }

