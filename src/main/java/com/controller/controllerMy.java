package com.controller;

import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@org.springframework.stereotype.Controller
public class controllerMy {
    @Resource
    private UserService userService;
    @RequestMapping("/user")
    public String GetAllUser(Model model) throws Exception{
        model.addAttribute("userList",userService.getAllUser());
        return "user";
    }
}
