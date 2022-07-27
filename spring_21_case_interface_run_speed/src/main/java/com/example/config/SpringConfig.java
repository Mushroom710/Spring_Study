package com.example.config;

// @DATE 2022/7/27
// @TIME 10:21
// @AUTHOR zhangzhi
// @DESCRIPTION

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
