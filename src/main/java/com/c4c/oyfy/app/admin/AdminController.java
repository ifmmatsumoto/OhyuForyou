package com.c4c.oyfy.app.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;

@Controller
@RequestMapping("/admin")
public class AdminController {

	/**
	 * 管理画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping
	@ModelAttribute
	public String bath(AdminForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("管理画面表示"); // TODO
		form.bath.setBathNameJa("あいうえ");
		// 銭湯詳細画面表示
		return "admin";
	}

}
