package com.example;

import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @DATE 2022/7/25
// @TIME 9:54
// @AUTHOR zhangzhi
// @DESCRIPTION
public class App2 {
    public static void main(String[] args) {
        // 加载配置文件得到上下文对象，也就是容器对象 -- Ioc 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("Spring02---");
        // 通过别名获取 bean
        BookService bookService = (BookService) ctx.getBean("service");
        System.out.println(bookService);
        BookService bookService1 = (BookService) ctx.getBean("bookService");
        System.out.println(bookService1);
    }
}
