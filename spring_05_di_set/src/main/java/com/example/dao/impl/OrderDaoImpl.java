package com.example.dao.impl;

// @DATE 2022/7/25
// @TIME 16:23
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    private int num;
    private String s;

    public void setNum(int num) {
        this.num = num;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void save() {
        System.out.println("order dao save..."+s+"+"+num);
    }
}
