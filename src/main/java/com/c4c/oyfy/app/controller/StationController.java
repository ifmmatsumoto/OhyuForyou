package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.StationForm;

@Controller
@RequestMapping("/station")
public class StationController extends _CommonController {

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
	public String station(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("駅検索(日本)画面表示"); // TODO

		// 駅検索(日本)画面表示
		return "station";
	}

	/**
	 * 駅検索(地域)画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("area")
	public String area(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("駅検索(地域)画面表示"); // TODO

		// 都道府県検索(地域)画面表示
		return "stationArea";
	}

	/**
	 * 駅検索
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("search")
	public String search(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("駅検索"); // TODO

		// 都道府県検索(地域)画面表示
		return "searchResult";
	}
}
