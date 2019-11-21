package com.c4c.oyfy.app.admin;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Base64;
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
import com.oyfy.dbflute.exentity.Bath;

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
    public Bath bath(AdminForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {
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
        if (!form.getInputImage().isEmpty()) {
            try {
                byte[] b = getByteArray(form.getInputImage().getInputStream());
                String bathImgStr = "data:image/jpg;base64," + Base64.getEncoder().encodeToString(b);
                form.bath.setBathImage(bathImgStr);
                System.out.println(bathImgStr);
            } catch (Exception e) {
                throw new OyfyException();
            }
        }
        // 定休日
        if (form.bathHoliday != null && form.bathHoliday.length > 0) {
            form.bath.setBathHoliday(Arrays.stream(form.bathHoliday).sum());
        }
        // 作成日時
        LocalDateTime now = LocalDateTime.now();
        if (form.bath.getCreateDate() == null) {
            form.bath.setCreateDate(now);
        }
        // 更新日時
        form.bath.setUpdateDate(now);

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

    /**
     * InputStreamをバイト配列に変換する
     * @param is
     * @return
     */
    private byte[] getByteArray(InputStream is) {
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        OutputStream os = new BufferedOutputStream(b);
        int c;
        try {
            while((c=is.read())!=-1) {
                os.write(c);
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(os!=null) {
                try{
                    os.flush();
                    os.close();
                } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return b.toByteArray();
    }
}
