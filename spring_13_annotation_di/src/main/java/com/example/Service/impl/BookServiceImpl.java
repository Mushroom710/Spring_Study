package com.example.Service.impl;

import com.example.Service.BookService;
import com.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// @DATE 2022/7/26
// @TIME 10:51
// @AUTHOR zhangzhi
// @DESCRIPTION

@Service
public class BookServiceImpl implements BookService {

    // 这个注解等同于自动装配，所以可以不用 setter 和 构造器
    // 在有多个实现类的时候，需要给每一个实现类一个id
    // 用 Qualifier 注解指定注入
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

//    public void setBookDao(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }

    public void save(){
        System.out.println("book service save...");
        bookDao.save();
    }
}
