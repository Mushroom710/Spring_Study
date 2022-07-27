package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

// @DATE 2022/7/26
// @TIME 10:50
// @AUTHOR zhangzhi
// @DESCRIPTION

@Repository
public class BookDaoImpl implements BookDao {
    public void save(){
        System.out.println("book dao save...");
    }
    public void update(){
        System.out.println("book dao update ...");
    }
}
