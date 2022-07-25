package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
// FactoryBean 创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao>{

    // FactoryBean 直接固定方法名，返回实例化的对象
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // 配置是否为单例模式
    public boolean isSingleton() {
        return true;
    }
}