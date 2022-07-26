package com.example;

import com.example.dao.BookDao;
import com.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @DATE 2022/7/26
// @TIME 10:12
// @AUTHOR zhangzhi
// @DESCRIPTION
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml.bak");
        // 按名称获取 bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        System.out.println(bookDao);
        // 按类型获取 bean
        // 在该类型的 bean 只有一个的时候可以用
        BookService bookService = ctx.getBean(BookService.class);
//        bookService.save();
        System.out.println(bookService);
    }
}
