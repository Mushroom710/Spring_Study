package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @DATE 2022/7/26
// @TIME 10:07
// @AUTHOR zhangzhi
// @DESCRIPTION

//@Component("bookDao")
@Repository
@Scope("prototype")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save...");
    }
}
