package com.ly.admintemp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempIndexPage {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }
}
