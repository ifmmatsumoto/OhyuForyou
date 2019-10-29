package com.c4c.oyfy.app.area;

import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.c4c.oyfy.OyfyException;
import com.c4c.oyfy.app._CommonController;
import com.c4c.oyfy.app.dto.LineDto;
import com.c4c.oyfy.app.dto.PrefectureDto;
import com.c4c.oyfy.app.dto.PrefectureDto.Prefecture;
import com.c4c.oyfy.app.dto.StationDto;
import com.c4c.oyfy.app.dto.StationDto.Response.Station;
import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.domain.bath.BathService;
import com.c4c.oyfy.domain.prefecture.PrefectureService;
import com.c4c.oyfy.domain.station.StationService;
import com.c4c.oyfy.util.OyfyConst.Division;

@Controller
@RequestMapping("/area")
public class AreaController extends _CommonController {

    @Autowired
    StationService stationService;
    @Autowired
    PrefectureService prefectureService;
    @Autowired
    BathService bathService;


    /**
     * 駅/都道府県検索(日本)画面表示
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
        //取得した区分から遷移先を変更する
        if (form.division == Division.STATION.id()) form.setAction(Division.STATION.str());
        if (form.division == Division.PREFECTUR.id()) form.setAction(Division.PREFECTUR.str());

        // 駅/都道府県検索(日本)画面表示
        return "area";
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

        // 日本地図画面から都道府県コードを取得する
        PrefectureDto prefectureDto = prefectureService.findPrefectureList(form.getAreaCode());

        List<Prefecture> prefectureList = prefectureDto.getData();

        form.setPrefectureList(prefectureList);

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

        // 都道府県名から路線リストを取得
        LineDto lineDto = stationService.findLineList(form.getAreaName());
        String[] lineList = lineDto.getResponse().getLine();

        // apiで返された値の順番を保持してほしいのでLinkedHashMap
        LinkedHashMap<String, List<Station>> lineMap = new LinkedHashMap<>();

        // 路線リスト分ループさせる
        for (String line : lineList) {
            // 路線名から駅リストを取得
            StationDto stationDto = stationService.findStationList(line);
            List<Station> stationList = stationDto.getResponse().getStation();
            lineMap.put(line, stationList);
            System.out.println("路線名" + line);
        }

        form.setLine(lineMap);

        // 駅検索(地域選択)画面表示
        return "stationArea";
    }

    /**
     * 検索結果（都道府県）画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping("/prefectureSearch")
    public String searchPrefecture(@ModelAttribute PrefectureSearchForm form, Model model) {

      // 検索結果一覧画面表示
      Conditions cond = new Conditions();
      String keyWord = PrefectureHelper.toKeyWord(form);
      cond.setKeyword(keyWord);

      ResultList resultList = bathService.findBathList(cond);
      model.addAttribute("resultList", resultList);

        // 検索結果（都道府県）画面表示
        return "searchResult";
    }

    /**
     * 検索結果（駅）画面表示
     * @param form
     * @param model
     * @param req
     * @param res
     * @return
     * @throws OyfyException
     */
    @RequestMapping("/stationSearch")
    public String searchStation(@ModelAttribute StationSearchForm form, Model model) {

        // 検索結果一覧画面表示
        Conditions cond = new Conditions();
        String keyWord = StationHelper.toKeyWord(form);
        cond.setKeyword(keyWord);

        ResultList resultList = bathService.findBathList(cond);
        model.addAttribute("resultList", resultList);

        // 検索結果（駅）画面表示
        return "searchResult";
    }

}
