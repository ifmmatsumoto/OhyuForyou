package com.c4c.oyfy.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.domain.service.test.TestService;

@Controller
public class TestController {

    final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }
// commitTest
    @RequestMapping(method = RequestMethod.GET)
    public String hello(Model model, TestForm form){
        int cntTest = testService.test();
        model.addAttribute("cntTest", cntTest);
        return "test/test";
    }
}
