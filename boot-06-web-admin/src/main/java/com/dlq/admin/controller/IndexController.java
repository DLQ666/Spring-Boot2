package com.dlq.admin.controller;

import com.dlq.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-30 14:38
 */
@Controller
public class IndexController {

    /**
     * 来登录页
     * @return
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {

        return "login";
    }

    @PostMapping("/login")
    public String indexPage(User user, HttpSession httpSession, Model model) {
        if (StringUtils.hasLength(user.getUserName()) && "123456".equals(user.getPassword())) {
            //把登陆成功的用户保存起来
            httpSession.setAttribute("loginUser", user);
            //登录成功重定向到 main.html；；重定向防止表单重复提交
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "账号密码错误！！！");
            //回到登录页
            return "login";
        }
    }

    /**
     * 去main 页面
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession httpSession,Model model) {

        //是否登陆，    采用拦截器  过滤器
        Object loginUser = httpSession.getAttribute("loginUser");
        if (loginUser != null){
            return "main";
        }else {
            model.addAttribute("msg", "请重新登录！！！");
            //回到登录页
            return "login";
        }
    }
}
