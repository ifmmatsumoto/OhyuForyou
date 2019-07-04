package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.IllustForm;

@Controller
@RequestMapping("/illust")
public class IllustController extends _CommonController {

	/**
	 * イラスト検索画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping
	public String illust(IllustForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("イラスト検索画面表示"); // TODO

		// イラスト検索画面表示
		return "illust";
	}

	/**
	 * イラスト検索
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
    @RequestMapping("search")
	public String search(IllustForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("イラスト検索"); // TODO

    	// 検索結果一覧画面表示
		return "searchResult";
	}
}
