package com.example.service.impl;

// @DATE 2022/7/25
// @TIME 16:00
// @AUTHOR zhangzhi
// @DESCRIPTION

import com.example.service.OrderService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OrderServiceImpl implements OrderService, InitializingBean, DisposableBean {
    public void save() {
        System.out.println("order service save...");
    }

    public void destroy() throws Exception {
        System.out.println("order service destroy..");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("order service init...");
    }
}