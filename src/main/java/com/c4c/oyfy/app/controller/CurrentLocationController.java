package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app._CommonController;
import com.c4c.oyfy.app.resultlist.ResultList;
import com.c4c.oyfy.app.test.TopForm;
import com.c4c.oyfy.domain.bath.BathService;

@Controller
@RequestMapping("/currentLocation")
public class CurrentLocationController extends _CommonController {

	@Autowired
	BathService bathService;

	/**
	 * TOP画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping
	public String top(TopForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("現在地検索");

		// TOP画面表示
		return "searchResult";
	}

	/**
	 * キーワード検索
	 * @param form
	 * @param result
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("keyword")
	public String keyword(TopForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("キーワード検索"); // TODO

		// TODO DBから銭湯リストを取得するサンプル ST -------------------------------
		System.out.println("入力したキーワード：" + form.getKeyword());
		ResultList resultList = bathService.getBathList(form.getKeyword(), form.getPage());
		model.addAttribute("keyword", form.getKeyword());
		model.addAttribute("resultList", resultList);
		// TODO DBから銭湯リストを取得するサンプル ED -------------------------------

		// 検索結果一覧画面表示
		return "searchResult";
	}
    /**
     * 現在地検索
     * @param form
     * @param result
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping("/test")
    public String currentLocation(TopForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

        System.out.println("キーワード検索"); // TODO

        // TODO DBから銭湯リストを取得するサンプル ST -------------------------------
        System.out.println("入力したキーワード：" + form.getKeyword());
        ResultList resultList = bathService.getBathList(form.getKeyword(), form.getPage());
        model.addAttribute("keyword", form.getKeyword());
        model.addAttribute("resultList", resultList);
        // TODO DBから銭湯リストを取得するサンプル ED -------------------------------

        // 検索結果一覧画面表示
        return "searchResult";
    }
}
