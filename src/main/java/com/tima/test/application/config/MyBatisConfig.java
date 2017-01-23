package com.tima.test.application.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created by ChenYu on 2017/1/20.
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.tima.test.dao.dao")
@AutoConfigureAfter(DruidDataSourceConfig.class)
public class MyBatisConfig {
//    implements TransactionManagementConfigurer
//    @Autowired
//    DataSource dataSource;
//
//    @Bean
//    public PlatformTransactionManager annotationDrivenTransactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }
}
