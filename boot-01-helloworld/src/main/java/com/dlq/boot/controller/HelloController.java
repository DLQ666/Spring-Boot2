package com.dlq.boot.controller;

import com.dlq.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-08 16:50
 */
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car getInfo(){
        return car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello，SpringBoot 2!";
    }
}
