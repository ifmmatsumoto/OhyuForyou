package com.c4c.oyfy.app.illust;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.domain.bath.BathService;
import com.c4c.oyfy.domain.illust.IllustSearchService;

@Controller
public class IllustSearchController {
    @Autowired
    IllustSearchService illustSearchService;
    @Autowired
    BathService bathService;

    /**
     * イラスト検索画面表示
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(value = "illust", method = RequestMethod.GET)
    public String illust(IllustItemForm form, Model model) {

        IllustSearchForm illustSearchForm = IllustHelper.toForm(illustSearchService.findAllTag());
        model.addAttribute("illustSearchForm", illustSearchForm);
        return "illust/illust";
    }

    /**
     * イラスト検索
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(path = "/illust", method = RequestMethod.POST)
    public String search(@ModelAttribute IllustSearchForm form, Model model){
        // 検索結果一覧画面表示
        Conditions cond = new Conditions();
        String keyWord = IllustHelper.toKeyWord(form);
        cond.setKeyword(keyWord);
        cond.setFeeFrom(form.getFee_low());
        cond.setFeeTo(form.getFee_high());

        ResultList resultList = bathService.findBathList(cond);
        model.addAttribute("resultList", resultList);

        return "searchResult";
    }
}
