package com.c4c.oyfy.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.TopForm;
import com.c4c.oyfy.domain.service.BathService;
import com.oyfy.dbflute.exentity.Bath;

@Controller
@RequestMapping(value = {"/top", "/"})
public class TopController extends _CommonController {

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

		System.out.println("TOP画面表示"); // TODO

		// TOP画面表示
		return "top";
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
		List<Bath> bathList = bathService.getBathList(form.getKeyword());
		model.addAttribute("keyword", form.getKeyword());
		model.addAttribute("bathList", bathList);
		// TODO DBから銭湯リストを取得するサンプル ED -------------------------------

		// 検索結果一覧画面表示
		return "searchResult";
	}

}
