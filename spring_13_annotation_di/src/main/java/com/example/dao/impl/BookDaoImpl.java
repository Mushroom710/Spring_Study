package com.example.dao.impl;

import com.example.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

// @DATE 2022/7/26
// @TIME 10:50
// @AUTHOR zhangzhi
// @DESCRIPTION

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    // 简单类型的注入直接用 @Value 注解
    // 也可以读取外部配置文件
    @Value("${name}")
    private String name;

    public void save(){
        System.out.println("book dao save..."+name);
    }
}

