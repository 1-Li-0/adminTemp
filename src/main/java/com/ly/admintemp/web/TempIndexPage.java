package com.ly.admintemp.web;

import com.ly.admintemp.entity.User;
import com.ly.admintemp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
public class TempIndexPage {
    @Autowired
    LoginService loginService;

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @PostMapping("/loginWithData.do")
    public String loginWithData(String username, String password, RedirectAttributes redirectAttributes) {
        User user = new User();
        user.setUsername(username.trim()); //用户名不能重复
        user.setPassword(password);
        boolean b = loginService.checkUserInfo(user);
        if (b) {
            return "success";
        }else {
            redirectAttributes.addFlashAttribute("err","用户名或者密码错误");
            return "redirect:http://localhost:8090";
        }
    }
}
