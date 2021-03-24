package com.dlq.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-24 13:25
 */
@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){

        request.setAttribute("msg", "成功了...");
        request.setAttribute("code", 007);
        return "forward:/success"; //转发到  /success 请求
    }

    @ResponseBody
    @GetMapping("/success")
    public Map success(@RequestAttribute("msg")String msg,
                       @RequestAttribute("code")Integer code,
                       HttpServletRequest request){

        String msg1 = (String) request.getAttribute("msg");
        Integer code1 = (Integer) request.getAttribute("code");
        Map<String,String> map = new HashMap<>();
        map.put("reqMethod_msg", msg1);
        map.put("annotation_msg", msg);
        return map;
    }
}
