package com.c4c.oyfy.app.admin;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.domain.bath.BathService;
import com.oyfy.dbflute.exentity.BathTest;

@Controller
@RequestMapping(value = {"/admin"})
public class AdminController {

    @Autowired
    BathService bathService;
    @Autowired
    MessageSource messages;

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
        Conditions cond = new Conditions();
        cond.setPage(form.getPage());
        form.setResultList(bathService.findBathList(cond));
        return "admin/admin";
    }

    /**
     * 銭湯詳細取得(REST)
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @ResponseBody
    @RequestMapping(value = "detail", method = RequestMethod.POST)
    public BathTest bath(AdminForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

        System.out.println("銭湯詳細画面表示"); // TODO

        // 銭湯詳細情報を取得して返す
        return bathService.findBathDetail(form.bath.getBathId());
    }

    /**
     * 銭湯登録・更新
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

        if (!form.getInputImage().isEmpty()) {
            // アップロードをbyteに変換
            try {
                form.bath.setBathImage(form.getInputImage().getBytes());
            } catch (Exception e) {
                throw new OyfyException();
            }
        }

        // 登録処理
        bathService.registBath(form.bath);

        // 登録完了メッセージ
        String[] msgVal = new String[] {"銭湯情報", "登録"};
        if (form.bath.getBathId() != 0) msgVal[1] = "更新";
        form.setOkMsg(messages.getMessage("regist.complete", msgVal, Locale.getDefault()));

        // 一覧取得
        Conditions cond = new Conditions();
        cond.setPage(form.getPage());
        form.setResultList(bathService.findBathList(cond));

        return "admin/admin";
    }

}
