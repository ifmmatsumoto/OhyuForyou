package com.c4c.oyfy.domain.bath;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.app.resultlist.ResultList;

@Service
@Transactional
public class BathService {

	@Autowired
    BathRepository bathRepository;

	/**
	 * キーワードを元に銭湯リストを取得
	 * @param keyword
	 * @param page
	 * @return
	 */
    public ResultList getBathList(String keyword, int page) {
        // 全角スペースを半角スペースに置換
        keyword = keyword.replace("　", " ");
        // キーワードを元に銭湯検索
        ResultList resultList = bathRepository.getBathList(keyword, page);
        // 検索キーワードを戻り値にセット
        resultList.setKeyword(keyword);
        // 半角スペースで分割してキーワード一覧をセット
        resultList.setKeywordList(Arrays.asList(keyword.split(" ")));
        return resultList;
    }
}
