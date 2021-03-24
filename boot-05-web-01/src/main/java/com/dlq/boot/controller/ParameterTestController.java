package com.dlq.boot.controller;

import org.springframework.web.bind.annotation.*;
import sun.management.Agent;
import sun.plugin2.main.server.Plugin;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-24 11:23
 */
@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id")Integer id,
                                     @PathVariable("username")String name,
                                     @PathVariable Map<String,String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @RequestHeader Map<String,String> header,
                                     @RequestParam("age")Integer age,
                                     @RequestParam("intrests")List<String> intrests,
                                     @RequestParam Map<String,String> params,
                                     @CookieValue("_ga")String _ga,
                                     @CookieValue("_ga")Cookie cookie){
        Map<String,Object> map = new HashMap<>();
        /*map.put("id", id);
        map.put("username", name);
        map.put("pv", pv);

        map.put("userAgent",userAgent);
        map.put("headers",header);*/

        map.put("age",age);
        map.put("intrests",intrests);
        map.put("params", params);

        map.put("_ga", _ga);
        map.put("cookie", cookie);
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    //1、语法： /cars/shell;low=34;brand=byd,audi,yd
    //SpringBoot  默认是禁用了矩阵变量的功能
    // 需要手动开启  原理：对于路径的处理。UrlPathHelper 进行解析
    //                    removeSemicolonContent（移除分号内容）支持矩阵变量的
    @GetMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low")Integer low,
                        @MatrixVariable("brand")List<String> brand,
                        @PathVariable("path")String path){
        Map<String,Object> map = new HashMap<>();

        map.put("low", low);
        map.put("brand", brand);
        map.put("path", path);
        return map;
    }

    //  /boss/1;age=20/2;age=10
    @GetMapping("/boss/{bossId}/{empId}")
    public Map boss(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                    @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        Map<String, Object> map = new HashMap<>();
        map.put("bossAge", bossAge);
        map.put("empAge", empAge);
        return map;
    }
}
