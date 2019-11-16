package com.c4c.oyfy.app.bath;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.domain.bath.BathService;
import com.oyfy.dbflute.exentity.Review;

@Controller
@RequestMapping("/bath")
public class BathController {

    @Autowired
    private BathService bathService;

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
		// 銭湯IDから銭湯詳細情報を取得してFormにセット
		BathHelper.toForm(form, bathService.findBathDetail(form.getBathId()));
		// タグ一覧を取得してFormにセット
		form.setTagList(bathService.findTagList(form.getBathId()));

		// TODO コメント取得処理
        form.setReviewList(bathService.findReviewList(form.getBathId()));

		// 銭湯詳細画面表示
		return "bath/bath";
	}

	/**
     * レビュー登録処理
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping(value = "regist", method = RequestMethod.POST)
    public String regist(BathForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {
        System.out.println("レビュー登録"); // TODO
        // TODO レビュー登録処理
        Review review = new Review();
        review.setBathId(form.getBathId());
        review.setNewyorker(form.getNewyorker());
        review.setReview(form.getReview());

        // TODO 入力チェック

        // TODO AdminController を参考に登録処理を作る
        bathService.registReview(review);

        // 銭湯詳細画面表示
        return "bath/regist";
    }

}
