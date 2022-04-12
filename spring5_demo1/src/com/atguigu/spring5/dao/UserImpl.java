package com.atguigu.spring5.dao;

public class UserImpl implements UserDao{

    @Override
    public void update() {
        System.out.println("dao update ...........");
    }
}
