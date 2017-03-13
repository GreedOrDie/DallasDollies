package com.dallasdollies.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by darionmoore on 3/13/17.
 */
@Controller
public class NavigationController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHomePage(Model model, HttpSession session){
        return "home";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String homePage(){
        return "redirect:/";
    }
}
