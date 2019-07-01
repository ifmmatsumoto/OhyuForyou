package com.c4c.oyfy.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dispBathDetailController {

    @RequestMapping("/dispBathDetail")
    public String hello(Model model){
        return "bathDetail/bathDetail";
    }
}
