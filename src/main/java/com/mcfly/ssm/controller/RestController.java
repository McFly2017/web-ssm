package com.mcfly.ssm.controller;

import com.mcfly.ssm.model.User;
import com.mcfly.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Notes on 2017/5/11.
 */
@Controller
@RequestMapping("/rest")
public class RestController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.POST)
    @ResponseBody
    public User getPerson(@PathVariable("id") String id){
        String name = "this is a test demo.Id is :" + id;
        return userService.getUserByEmail("1256221654@qq.com");
    }
}
