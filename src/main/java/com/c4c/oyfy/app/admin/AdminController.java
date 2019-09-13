package com.c4c.oyfy.app.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.domain.bath.BathService;

@Controller
@RequestMapping(value = {"/admin"})
public class AdminController {

    @Autowired
    BathService bathService;

    /**
     * 管理画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping(method = RequestMethod.GET)
    public String disp(AdminForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {
        form.setResultList(bathService.findBathList(null));
        return "admin/admin";
    }

    /**
     * 銭湯登録
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping(value = "regist", method = RequestMethod.POST)
    public String regist(AdminForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {
        // TODO 入力チェック
        bathService.registBath(form.bath);
        return "admin/admin";
    }

}
