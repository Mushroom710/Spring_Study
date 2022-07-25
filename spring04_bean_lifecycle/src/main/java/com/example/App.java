package com.example;

import com.example.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @DATE 2022/7/25
// @TIME 15:54
// @AUTHOR zhangzhi
// @DESCRIPTION

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
//        ctx.close();
        ctx.registerShutdownHook();
    }
}
