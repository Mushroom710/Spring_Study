package com.example;

// @DATE 2022/7/27
// @TIME 10:42
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.config.SpringConfig;
import com.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = ctx.getBean(AccountService.class);
        System.out.println(accountService.findById(1));

    }
}
