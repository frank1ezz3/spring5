package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserImpl;

public class UserSrvice {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("Service add .....");

        userDao.update();
        //创建UserDao对象
//        UserDao dao = new UserImpl();//原始方式
//        dao.update();
    }
}
