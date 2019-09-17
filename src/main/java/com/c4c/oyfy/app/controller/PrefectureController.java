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
        form.setAreaCode("13");

        PrefectureDto prefectureDto = prefectureService.findPrefectureList(form.getAreaCode());

        System.out.println(prefectureDto);

        System.out.println("tymleafへ渡している地域名値\n" + prefectureDto);

        // TODO:市区町村apiのマッピングがうまくいかないためテスト値（マッピング実装したら消す）
        String[] testPrefecture = {"足立区" ,  "墨田区" ,  "荒川区" ,  "世田谷区" ,  "板橋区" ,  "台東区" ,  "江戸川区" ,  "千代田区" ,  "大田区" ,  "中央区" ,  "葛飾区" ,  "豊島区" ,  "北区" ,  "中野区" ,  "江東区" ,  "練馬区" ,  "品川区" ,  "文京区" ,  "渋谷区" ,  "港区" ,  "新宿区" ,  "目黒区" ,  "杉並区"};

        // TODO:areaNameは連携される都道府県名、dataは市区町村apiのresponse
        model.addAttribute("areaName", "東京都");
        model.addAttribute("data", testPrefecture);

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

         // TODO:都道府県名が連携されるようになったら消す
         form.setAreaName("東京都");

         LineDto lineDto = stationService.findLineList(form.getAreaName());

         // TODO:lindDto分、駅名検索apiを実行させるように実装する
         StationDto stationDto = stationService.findStationList(lineDto.getResponse().getLine());

         List<Station> StationList = stationDto.getResponse().getStation();

         // 駅数をList作成のための要素数を宣言
         int i = 0;
         int m = 0;

         // 要素数を取得
         for(Station name : StationList) {
              i++;
              System.out.println(i);
         }

         // 駅名を格納するためのjavaListを生成
         List<String> stationNameList  = new ArrayList<String>();
         for(int n=0; n < i; n++) {
             System.out.println(n);
             stationNameList.add(n, StationList.get(n).getName());
         }

         System.out.println("tymleafへ渡している路線名値\n" + lineDto.getResponse().getLine());



         List<String> testArray = new ArrayList<>();

         LinkedHashMap<String, List<String>> elementMap = new LinkedHashMap<>();
         for( String station :  stationNameList) {
//             elementMap.put("JR中央線", stationNameList.get(m));
             if(!elementMap.containsKey("JR中央線")) {
             elementMap.put("JR中央線", testArray);
             }
             elementMap.get("JR中央線").add(stationNameList.get(m));
             m++;
         }

//         map.put("JR中央線", stationNameList);

         System.out.println("tymleafへ渡している路線名値\n" + stationNameList.get(0));


          // 画面へ値を表示
//          model.addAttribute("line", lineDto.getResponse().getLine());
          model.addAttribute("line", elementMap);
          model.addAttribute("stationList", elementMap.values());
//          model.addAttribute("station", stationNameList);

          // 駅検索(地域選択)画面表示
          return "stationArea";
     }
}
