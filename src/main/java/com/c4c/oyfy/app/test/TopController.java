package com.c4c.oyfy.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

    @RequestMapping("/")
    public String top(Model model){
        return "top/top";
    }

    @RequestMapping("/searchKeyword")
    public String searchKeyword(){
    	return "redirect:http://localhost:8080/dispSearchResult";
    }

    @RequestMapping("/searchPlace")
    public String searchPlace(){
    	return "redirect:http://localhost:8080/dispSearchResult";
    }

}
