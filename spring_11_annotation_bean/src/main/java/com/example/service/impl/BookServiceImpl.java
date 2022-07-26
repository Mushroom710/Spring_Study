package com.example.service.impl;

import com.example.service.BookService;
import org.springframework.stereotype.Component;

// @DATE 2022/7/26
// @TIME 10:11
// @AUTHOR zhangzhi
// @DESCRIPTION

@Component
public class BookServiceImpl implements BookService {
    public void save(){
        System.out.println("book service save...");
    }
}
