package com.c4c.oyfy.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.dto.LineDto;
import com.c4c.oyfy.app.dto.PrefectureDto;
import com.c4c.oyfy.app.dto.StationDto;
import com.c4c.oyfy.app.form.PrefectureForm;
import com.c4c.oyfy.app.form.StationForm;
import com.c4c.oyfy.domain.service.PrefectureService;
import com.c4c.oyfy.domain.service.StationService;

@Controller
@RequestMapping("/area")
public class PrefectureController extends _CommonController {

    @Autowired
    StationService stationService;
    @Autowired
    PrefectureService prefectureService;

	/**
	 * 駅検索(日本)画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping
	public String prefecture(PrefectureForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("検索(日本)画面表示");

		// 駅検索(日本)画面表示
		return "prefecture";
	}

	 /**
     * 都道府県検索(地域)画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping("prefecture")
    public String area(PrefectureForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

        System.out.println("都道府県検索(地域)画面表示");

        // test
        form.setAreaCode(13);

        PrefectureDto prefectureDto = prefectureService.findPrefectureList(form.getAreaCode());

        System.out.println(prefectureDto.getStatus());

        System.out.println("tymleafへ渡している地域名値\n" + prefectureDto);

        // TODO:画面表示確認のため路線結果を仮指定
        model.addAttribute("data", prefectureDto.getData());

        // 都道府県検索(地域)画面表示
        return "prefectureArea";
    }

	/**
	 * 駅検索(地域)画面表示
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("station")
	public String station(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("駅検索(地域)画面表示");

		// test
		form.setAreaName("東京都");

		LineDto lineDto = stationService.findLineList(form.getAreaName());

		System.out.println(lineDto.getResponse().getLine());

		StationDto stationDto = stationService.findStationList(lineDto.getResponse().getLine());

        // TODO:linesから値を取り出して駅検索のAPIを実行→実行結果を取得する
        // StationDto stationDto = stationService.findStationList(lines);
        // List<String> stations = stationDto.findResponse();
        // [山手線:["品川","田町"....]のような連想配列にして画面へ返して表示させる

	    System.out.println("tymleafへ渡している路線名値\n" + lineDto.getResponse().getLine());
	    System.out.println("tymleafへ渡している駅名値\n" + stationDto.getResponse().getStation());

        // TODO:画面表示確認のため路線結果を仮指定
		model.addAttribute("line", lineDto.getResponse().getLine());
        model.addAttribute("station", stationDto.getResponse().getStation());

		// 駅検索(地域選択)画面表示
		return "stationArea";

	}

	/**
	 * 駅検索
	 * @param form
	 * @param model
	 * @param req
	 * @param res
	 * @return
	 * @throws OyfyException
	 */
	@RequestMapping("search")
	public String search(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res) throws OyfyException {

		System.out.println("都道府県or駅検索結果");

		// TODO 画面上でチェックされた駅名をもとに銭湯の検索処理を実行する

		// 検索結果画面表示
		return "searchResult";
	}
}
