package com.atguigu.spring5.testdemo;


import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import com.atguigu.spring5.bean.emp;
import com.atguigu.spring5.service.UserSrvice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    @Test
    public void testBean1(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2获取配置创建的对象
        UserSrvice userService = context.getBean("userService",UserSrvice.class);

        userService.add();
    }
    @Test
    public void testBean2(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2获取配置创建的对象
        emp emp= context.getBean("emp", emp.class);

        emp.add();
    }
    @Test
    public void testBean3(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2获取配置创建的对象
        emp emp= context.getBean("emp", emp.class);

        emp.add();
    }

}
