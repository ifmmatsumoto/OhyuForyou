package com.c4c.oyfy.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dispSearchResultController {

    @RequestMapping("/dispSearchResult")
    public String dispSearchResult(Model model){
        return "searchResult/searchResult";
    }

    @RequestMapping("/searchBathDetail")
    public String searchBathDetail(Model model){
        return "redirect:http://localhost:8080/dispSearchResult";
    }
}
