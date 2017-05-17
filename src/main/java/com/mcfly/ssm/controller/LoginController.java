package com.mcfly.ssm.controller;

import com.mcfly.ssm.model.User;
import com.mcfly.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/")
public class LoginController {
    private Logger log = Logger.getLogger(LoginController.class);
    @Resource
    private UserService userService;

    //获取session
    HttpSession session;
    ServletContext application;

    @RequestMapping(value = "")
    public  String defaultpage(Model model){
        return "index";
    }

    @RequestMapping(value = "/login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse resp, Model model){
        String username=req.getParameter("username");
        String pwd=req.getParameter("password");
        session = req.getSession();
        session.setAttribute("name", username); // 保存当前登录的用户名
        //
        application = req.getSession().getServletContext();

        if (userService.login(username,pwd)) {
            model.addAttribute("username",username);
            model.addAttribute("pwd",pwd);
            return new ModelAndView("/success");
        }
        model.addAttribute("error","账号或密码错误，请重新输入");
        return new ModelAndView("index");
    }
}
