package com.example.config;

// @DATE 2022/7/26
// @TIME 10:51
// @AUTHOR zhangzhi
// @DESCRIPTION

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example")
//@PropertySource加载properties配置文件
@PropertySource({"jdbc.properties"})
public class SpringConfig {
}
