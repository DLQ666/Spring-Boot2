package com.dlq.boot.controller;

import com.dlq.boot.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-26 15:41
 */
@Controller
public class ResponseTestConroller {

    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){
        Person person = new Person();
        person.setAge(29);
        person.setBirth(new Date());
        person.setUserName("zhangsan");
        return person;
    }
}
