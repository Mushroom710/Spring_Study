package com.example.Service.impl;

import com.example.Service.BookService;
import org.springframework.stereotype.Service;

// @DATE 2022/7/26
// @TIME 10:51
// @AUTHOR zhangzhi
// @DESCRIPTION

@Service
public class BookServiceImpl implements BookService {
    public void save(){
        System.out.println("book service save...");
    }
}
