package com.stackroute.controller;

import com.stackroute.model.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView login() {
        ModelAndView modelAndView= new ModelAndView("home");
        return modelAndView;
    }

    @RequestMapping("/login")
    public ModelAndView welcomeUser() {
        UserDetails user = new UserDetails();
        user.setUserName("Sushree");
        ModelAndView modelAndView = new ModelAndView("userDetails");
        modelAndView.addObject("name", user.getUserName() + " Welcome to Stackroute");
        return modelAndView;
    }
}
