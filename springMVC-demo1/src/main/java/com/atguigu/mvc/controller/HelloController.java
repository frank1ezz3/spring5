package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//运行失败的原因是主modul不是maven所以会500
@Controller
public class HelloController {
    //请求映射 非常重要
    @RequestMapping(value = "/")
    public String index(){
        //返回视图名称
        return "index";
    }


}
