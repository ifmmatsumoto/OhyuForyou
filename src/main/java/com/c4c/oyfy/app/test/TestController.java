package com.c4c.oyfy.app.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.domain.service.test.TestService;

@Controller
public class TestController {

    final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }

    @RequestMapping("/")
    public String hello(Model model){
        int cntTest = testService.test();
        System.out.println(cntTest);
        model.addAttribute("cntTest", cntTest);
        return "test/test2";
    }
}
