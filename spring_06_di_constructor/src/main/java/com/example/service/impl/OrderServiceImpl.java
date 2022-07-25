package com.example.service.impl;

// @DATE 2022/7/25
// @TIME 16:46
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.service.OrderService;

public class OrderServiceImpl implements OrderService {

    private int num;
    private String s;

    public OrderServiceImpl(int num, String s) {
        this.num = num;
        this.s = s;
    }

    public void save() {
        System.out.println("order service save..."+s+"+"+num);
    }
}
