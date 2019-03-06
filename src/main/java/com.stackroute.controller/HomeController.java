package com.stackroute.controller;

import com.stackroute.module.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String greeting(ModelMap map){
        return "index";
    }
    @RequestMapping(value = "/success")
    public String success(@RequestParam("username")String username,@RequestParam("password")String passsword, ModelMap map){
        User user=new User();
        user.setName(username);
        map.addAttribute("user",user);
        return "success";
    }

}
