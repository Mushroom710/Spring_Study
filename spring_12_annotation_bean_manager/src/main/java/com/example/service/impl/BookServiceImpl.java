package com.example.service.impl;

import com.example.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @DATE 2022/7/26
// @TIME 10:11
// @AUTHOR zhangzhi
// @DESCRIPTION

@Repository
public class BookServiceImpl implements BookService {
    public void save(){
        System.out.println("book service save...");
    }
    //@PostConstruct设置bean的初始化方法
    @PostConstruct
    public void init(){
        System.out.println("init ...");
    }
    //@PreDestroy设置bean的销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("destroy ...");
    }
}
