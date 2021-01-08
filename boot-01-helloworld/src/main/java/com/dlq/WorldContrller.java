package com.dlq;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-08 18:00
 */
@RestController
public class WorldContrller {

    @RequestMapping("/w")
    public String handle01(){
        return "Hello，SpringBoot 2!";
    }
}
