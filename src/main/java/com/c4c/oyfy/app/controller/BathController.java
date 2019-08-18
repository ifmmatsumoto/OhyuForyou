package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.form.BathForm;
import com.c4c.oyfy.domain.service.BathService;
import com.oyfy.dbflute.exentity.Bath;

@Controller
@RequestMapping("/bath")
public class BathController {

    @Autowired
    BathService bathService;

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

		Bath bath = bathService.findBath(form.getBathId());

		model.addAttribute("bath", bath);


		// 銭湯詳細画面表示
		return "bath";

	}

}
