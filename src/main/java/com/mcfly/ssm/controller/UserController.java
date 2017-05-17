package com.mcfly.ssm.controller;

import com.mcfly.ssm.model.User;
import com.mcfly.ssm.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String defaultpage(HttpServletRequest request, Model model){
        model.addAttribute("userList","89757452");
        return "show";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        //User user = userService.getUserByEmail("1256221654@qq.com");
        model.addAttribute("userList",userList);
       // model.addAttribute("user",user);
        return "showUser";
    }
    @RequestMapping("/show")
    public String show(HttpServletRequest request, Model model){
        model.addAttribute("userList","89757452");
        return "show";
    }

    @RequestMapping("/add")
    public String add(User user,Model model){
        if (userService.addUser(user)){
            return "show";
        }
        return "show";
    }
    @RequestMapping("/delete")
    public String delete(Integer id,Model model){
        if (userService.deleteById(id)){
            return "show";
        }
        return "show";
    }
    @RequestMapping("/update")
    public String update(User user,Model model){
        if (userService.updateUser(user)) {
            return "show";
        }
        return "show";
    }
}
