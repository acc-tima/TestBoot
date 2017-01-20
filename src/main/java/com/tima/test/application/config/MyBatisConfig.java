package com.tima.test.application.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ChenYu on 2017/1/20.
 */
@Configuration
@MapperScan("com.tima.test.dao.dao")
public class MyBatisConfig  {

//    @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
}
