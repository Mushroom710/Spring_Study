package com.example;

// @DATE 2022/7/25
// @TIME 16:49
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService orderService = (OrderService) ctx.getBean("orderService");
        orderService.save();
    }
}
