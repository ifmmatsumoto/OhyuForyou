package com.c4c.oyfy.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dispSearchIllustController {

    @RequestMapping("/dispSearchIllust")
    public String dispSearchIllust(Model model){
        return "searchIllust/searchIllust";
    }

    @RequestMapping("/searchIllust")
    public String dispSearchResult(Model model){
    	return "redirect:http://localhost:8080/dispSearchResult";
    }
}
