package com.c4c.oyfy.app;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.TopForm;

@Controller
@RequestMapping(value = {"/top", "/"})
public class TopController extends _CommonController {

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
	 * 現在地検索
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("place")
	public String place(TopForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("現在地検索"); // TODO

		// 検索結果一覧画面表示
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

		// 検索結果一覧画面表示
		return "searchResult";
	}

}
