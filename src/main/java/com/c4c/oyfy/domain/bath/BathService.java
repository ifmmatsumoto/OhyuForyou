package com.c4c.oyfy.domain.bath;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.app.search.Conditions;
import com.c4c.oyfy.app.search.ResultList;

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
        // 全角スペースを半角スペースに置換
        cond.setKeyword(cond.getKeyword().replace("　", " "));
        // 銭湯検索
        ResultList resultList = bathRepository.findBathList(cond.getKeyword(), cond.getFeeFrom(), cond.getFeeTo(), cond.getPage());
        // 検索キーワードを戻り値にセット
        resultList.setKeyword(cond.getKeyword());
        // TODO 料金From～Toキーワード一覧にセット

        // 半角スペースで分割してキーワード一覧をセット
        resultList.setKeywordList(Arrays.asList(cond.getKeyword().split(" ")));
        return resultList;
    }
}
