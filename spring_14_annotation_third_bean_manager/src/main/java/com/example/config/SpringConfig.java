package com.example.config;

// @DATE 2022/7/26
// @TIME 10:51
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.example")
// @Import:导入配置信息
@Import(JdbcConfig.class)
public class SpringConfig {

}
