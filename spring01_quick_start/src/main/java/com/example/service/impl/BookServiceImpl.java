package com.example.service.impl;

import com.example.dao.BookDao;
import com.example.dao.impl.BookDaoImpl;
import com.example.service.BookService;

// @DATE 2022/7/25
// @TIME 9:30
// @AUTHOR zhangzhi
// @DESCRIPTION

public class BookServiceImpl implements BookService {
    // 原生写法
//    private BookDao bookDao = new BookDaoImpl();
    // DI 依赖注入
    // 通过配置文件描述关系
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao){
        this.bookDao = bookDao;
    }
}
