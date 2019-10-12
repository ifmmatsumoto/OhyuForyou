package com.c4c.oyfy.domain.bath;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.app.search.ResultList;
import com.oyfy.dbflute.exentity.Bath;
import com.c4c.oyfy.app.top.CurrentLocationForm;
@Service
@Transactional
public class BathService {

    @Autowired
    BathRepository bathRepository;

    /**
     * 検索条件を元に銭湯リストを取得
     * @return
     */
    public ResultList findBathList(Conditions cond) {
        if (cond == null) cond = new Conditions();
        // 全角スペースを半角スペースに置換
        if (!StringUtils.isEmpty(cond.getKeyword())) cond.setKeyword(cond.getKeyword().replace("　", " "));
        // 銭湯検索
        ResultList resultList = bathRepository.findBathList(cond.getKeyword(), cond.getFeeFrom(), cond.getFeeTo(), cond.getPage());
        // 検索キーワードを戻り値にセット
        resultList.setKeyword(cond.getKeyword());
        // TODO 料金From～Toキーワード一覧にセット

        // 半角スペースで分割してキーワード一覧をセット
        if (!StringUtils.isEmpty(cond.getKeyword())) {
            resultList.setKeywordList(Arrays.asList(cond.getKeyword().split(" ")));
        }
        return resultList;
    }

    /**
     * 銭湯IDを元に銭湯詳細を取得
     * @return
     */
    public Bath findBathDetail(int bathId) {
        return bathRepository.findBathDetail(bathId);
    }

    /**
     * 銭湯登録・更新
     * @param bath
     */
    public void registBath(Bath bath) {
        bathRepository.registBath(bath);
    }

    public ResultList findNearbyBath(CurrentLocationForm currentLocationForm) {
        return bathRepository.findNearbyBath(currentLocationForm);
    }
}
