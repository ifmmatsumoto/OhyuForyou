package com.c4c.oyfy.app.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dispSearchPrefectureController {

    @RequestMapping("/dispSearchPrefecture")
    public String dispSearchPrefecture(Model model){
        return "searchPrefecture/searchPrefecture";
    }

    @RequestMapping("/searchPrefecture")
    public String searchPrefecture(Model model){
        return "redirect:http://localhost:8080/dispSearchResult";
    }
}
