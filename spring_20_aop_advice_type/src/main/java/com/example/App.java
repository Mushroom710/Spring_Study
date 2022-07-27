package com.example;

// @DATE 2022/7/26
// @TIME 10:54
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.config.SpringConfig;
import com.example.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.update();
    }
}
