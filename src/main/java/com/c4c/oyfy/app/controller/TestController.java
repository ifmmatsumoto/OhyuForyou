package com.c4c.oyfy.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.app.form.TestForm;
import com.c4c.oyfy.app.form.TestHelper;
import com.c4c.oyfy.domain.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping
	public String test(Model model, TestForm form){

	    List<TestForm> bath = TestHelper.toForm(testService.searchPathList(""));
	    model.addAttribute("bath", bath);
	    return "test";
	}
}
