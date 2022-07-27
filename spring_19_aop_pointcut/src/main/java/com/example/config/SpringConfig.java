package com.example.config;

// @DATE 2022/7/26
// @TIME 10:51
// @AUTHOR zhangzhi
// @DESCRIPTION

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example")
//开启注解开发AOP功能
@EnableAspectJAutoProxy
public class SpringConfig {
}
