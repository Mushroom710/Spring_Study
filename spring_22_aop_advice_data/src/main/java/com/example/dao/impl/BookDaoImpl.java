package com.example.dao.impl;

// @DATE 2022/7/27
// @TIME 10:16
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public String findName(int id,String password) {
        System.out.println("id:"+id);
//        if(true)throw new NullPointerException();
        return "zhang san";
    }
}
