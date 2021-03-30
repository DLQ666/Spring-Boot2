package com.dlq.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-30 13:50
 */
@Controller
public class ViewTestController {

    @GetMapping("/hithy")
    public String thy(Model model){
        //model中的数据会被放在请求域中 request.setAttribute("a",aa);
        model.addAttribute("msg", "你好！thymeleaf");
        model.addAttribute("link", "http://www.baidu.com");
        return "success";
    }
}
