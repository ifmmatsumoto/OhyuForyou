package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.PrefectureForm;

@Controller
@RequestMapping("/location")
public class LocationController extends _CommonController {
    /**
     * 現在地検索画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping
    public String current(PrefectureForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

        System.out.println("現在地検索画面表示");

        // 検索結果一覧画面表示
        return "searchResult";
    }
}
