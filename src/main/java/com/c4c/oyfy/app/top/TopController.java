package com.c4c.oyfy.app.top;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app._CommonController;
import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.domain.bath.BathService;

@Controller
@RequestMapping(value = {"/top", "/"})
public class TopController extends _CommonController {

    @Autowired
    BathService bathService;

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
        // TOP画面表示
        return "top/top";
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
        // 検索条件をセット
        Conditions cond = new Conditions();
        cond.setKeyword(form.getKeyword());
        cond.setPage(form.getPage());
        // キーワード検索
        model.addAttribute("resultList", bathService.findBathList(cond));

        // 検索結果一覧画面表示
        return "result/searchResult";
    }

    /**
     * 現在地検索
     * @param form
     * @param model
     * @return
     */
    @RequestMapping(path = "nearbyBath", method = RequestMethod.POST)
    public String searchNearbyBath(TopForm form, Model model) {
        form.setDistance(3);// 半径
        model.addAttribute("resultList", bathService.findNearbyBath(form));
        return "result/searchResult";
    }
}
