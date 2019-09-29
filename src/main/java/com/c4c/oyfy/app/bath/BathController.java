package com.c4c.oyfy.app.bath;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.domain.bath.BathService;
import com.oyfy.dbflute.exentity.Bath;

@Controller
@RequestMapping("/bath")
public class BathController {

    private final BathService bathService;

    @Autowired
    public BathController (BathService bathService) {
        this.bathService = bathService;
    }

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

		Bath bath = bathService.findBath(form.getBathId());

		form.setBathNameJa(bath.getBathNameJa());
		form.setBathNameEn(bath.getBathNameEn());
		form.setBathAreaCode(bath.getBathAreaCode());
		form.setBathCityCode(bath.getBathCityCode());
		form.setBathImage(bath.getBathImage());
		form.setBathAddressJa(bath.getBathAddressJa());
		form.setBathAddressEn(bath.getBathAddressEn());
		form.setBathTel(bath.getBathTel());
		form.setBathDetail(bath.getBathDetail());
		form.setBathFee(bath.getBathFee());
		form.setBathType(bath.getBathType());
		form.setBath24hFlg(bath.getBath24hFlg());
		form.setBathTimeSt(bath.getBathTimeSt());
		form.setBathTimeEd(bath.getBathTimeEd());
		form.setBathPlaceLat(bath.getBathPlaceLat());
		form.setBathPlaceLon(bath.getBathPlaceLon());
		form.setBathTemperatureUp(bath.getBathTemperatureUp());
		form.setBathTemperatureLow(bath.getBathTemperatureLow());
		form.setBathHoliday(bath.getBathHoliday());

		model.addAttribute("bath", form);

		// 銭湯詳細画面表示
		return "bath";
	}
}
