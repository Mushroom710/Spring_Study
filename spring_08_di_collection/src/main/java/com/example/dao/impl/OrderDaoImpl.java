package com.example.dao.impl;

import com.example.dao.OrderDao;

import java.util.*;

// @DATE 2022/7/25
// @TIME 17:16
// @AUTHOR zhangzhi
// @DESCRIPTION

public class OrderDaoImpl implements OrderDao {
    private int[] array;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        System.out.println("save ...");
        System.out.println("遍历数组："+ Arrays.toString(array));
        System.out.println("遍历list："+list);
        System.out.println("遍历map："+map);
        System.out.println("遍历set："+set);
        System.out.println("遍历properties："+properties);
    }
}
