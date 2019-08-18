package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.StationForm;

@Controller
@RequestMapping("/location")
public class LocationControllor {

    /**
     * 駅検索(日本)画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping
    public String location(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

        System.out.println("現在地検索結果画面表示");

        // 駅検索(日本)画面表示
        return "searchResult";
    }


}
