package com.c4c.oyfy.app.bath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;

@Controller
@RequestMapping("/bath")
public class BathController {

	/**
	 * 銭湯詳細画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping
	public String bath(BathForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("銭湯詳細画面表示"); // TODO

		// 銭湯詳細画面表示
		return "bath";
	}

}