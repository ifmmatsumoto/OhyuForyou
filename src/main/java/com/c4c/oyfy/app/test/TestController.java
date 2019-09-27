package com.c4c.oyfy.app.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.domain.test.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService testService;

	@RequestMapping(path = "/hoge", method = RequestMethod.GET)
	public String test(Model model, TestForm form){

	    String keyword = form.getKeyword();
	    if(keyword.isEmpty()) {
	        return "test/test";
	    }
	    List<TestForm> baths = TestHelper.toForm(testService.searchPathList(form.getKeyword()));
	    model.addAttribute("baths", baths);
	    return "test/test";
	}

}
