package com.c4c.oyfy.app.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app.dto.LineDto;
import com.c4c.oyfy.app.dto.PrefectureDto;
import com.c4c.oyfy.app.dto.PrefectureDto.Prefecture;
import com.c4c.oyfy.app.dto.StationDto;
import com.c4c.oyfy.app.dto.StationDto.Response.Station;
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
    public String prefecture(PrefectureForm form, Model model, HttpServletRequest req, HttpServletResponse res)
            throws OyfyException {

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
    public String area(PrefectureForm form, Model model, HttpServletRequest req, HttpServletResponse res)
            throws OyfyException {

        System.out.println("都道府県検索(地域)画面表示");

        // test
        form.setAreaCode("13");

        PrefectureDto prefectureDto = prefectureService.findPrefectureList(form.getAreaCode());

        List<Prefecture> prefectureList = prefectureDto.getData();

        // 地域名を格納するためのjavaListを生成
        List<String> prefectureNameList = new ArrayList<String>();

        // ループ用変数
        int i = 0;

        for (Prefecture prefecture : prefectureList) {
            prefectureNameList.add(i, prefectureList.get(i).getName());
            System.out.println("入ってる地域名" + prefectureList.get(i).getName());
            i++;
        }

        System.out.println("tymleafへ渡している地域名値\n" + prefectureList);

        // TODO:areaNameは連携される都道府県名、dataは市区町村apiのresponse
        model.addAttribute("areaName", "東京都");
        model.addAttribute("data", prefectureNameList);

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
    public String station(StationForm form, Model model, HttpServletRequest req, HttpServletResponse res)
            throws OyfyException {

        // TODO:都道府県名が連携されるようになったら消す
        form.setAreaName("東京都");

        // ループ用変数
        int i = 0;


        // 路線名を取得
        LineDto lineDto = stationService.findLineList(form.getAreaName());

        // 路線リストを生成
        String[] lineList = lineDto.getResponse().getLine();

        // apiで返された値の順番を保持してほしいのでLinkedHashMap
        LinkedHashMap<String, List<String>> elementMap = new LinkedHashMap<>();

        // 路線リスト分ループさせる
        for (String line : lineList) {
            // TODO:lindDto分、駅名検索apiを実行させるように実装する
            StationDto stationDto = stationService.findStationList(lineList[i]);

            List<Station> stationList = stationDto.getResponse().getStation();

            // 駅名を格納するためのjavaListを生成
            List<String> stationNameList = new ArrayList<String>();

            // key毎でstationListは取り直すため、ループ用変数も毎回ここで初期化
            int j = 0;

            for (Station name : stationList) {
                stationNameList.add(j, stationList.get(j).getName());
                System.out.println("入ってる駅名" + stationList.get(j).getName());
                j++;
            }

            elementMap.put(lineList[i], stationNameList);
            System.out.println("路線名" + lineList[i]);

            i++;
        }

        // 画面へ値を表示
        model.addAttribute("line", elementMap);
        model.addAttribute("stationList", elementMap.values());

        // 駅検索(地域選択)画面表示
        return "stationArea";
    }
}
