package com.example.module2.controller;


import com.example.module2.utils.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
@RequestMapping("/module2")
public class ModuleController {

    @GetMapping("/index")
    public String index(Model model) {
        System.out.println(Utils.getClientLogOutUrl());
        model.addAttribute("logOutURL", Utils.getClientLogOutUrl());
        return "index";
    }
    @RequestMapping("/logOut")
    public void logOut(HttpSession session){
        session.invalidate();

    }


}
