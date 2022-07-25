package com.example.dao.impl;

import com.example.dao.BookDao;

//public class BookDaoImpl implements BookDao {
//    public void save() {
//        System.out.println("book dao save ...");
//    }
//    //表示bean初始化对应的操作
//    public void init(){
//        System.out.println("init...");
//    }
//    //表示bean销毁前对应的操作
//    public void destory(){
//        System.out.println("destory...");
//    }
//
//}
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }
    // 表示 bean 初始化对应的操作
    public void init(){
        System.out.println("book dao init...");
    }
    // 表示 bean 销毁前对应的操作
    public void destroy(){
        System.out.println("book destroy..");
    }
}
