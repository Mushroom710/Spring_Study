package com.example;

import com.example.service.BookService;
import com.example.service.impl.BookServiceImpl;

// @DATE 2022/7/25
// @TIME 9:37
// @AUTHOR zhangzhi
// @DESCRIPTION

public class App {
    public static void main(String[] args){
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
