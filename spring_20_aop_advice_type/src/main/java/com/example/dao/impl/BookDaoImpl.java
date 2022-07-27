package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

// @DATE 2022/7/26
// @TIME 10:50
// @AUTHOR zhangzhi
// @DESCRIPTION

@Repository
public class BookDaoImpl implements BookDao {
    public void update(){
        System.out.println("book dao update is running ...");
    }

    public int select() {
        System.out.println("book dao select is running ...");
//        int i = 1/0;
        return 100;
    }
}
