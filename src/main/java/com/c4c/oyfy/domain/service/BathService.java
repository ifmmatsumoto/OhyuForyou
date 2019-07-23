package com.c4c.oyfy.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.c4c.oyfy.domain.repository.BathRepository;
import com.oyfy.dbflute.exentity.Bath;

@Service
@Transactional
public class BathService {

	@Autowired
    BathRepository bathRepository;

    /**
     * 銭湯リストを取得
     * @param keyword
     * @return
     */
    public List<Bath> getBathList(String keyword) {
        List<Bath> bathList = new ArrayList<Bath>();
        if (StringUtils.isEmpty(keyword)) {
            // 全銭湯を取得
            bathList = bathRepository.searchBathList();
        } else {
            // 全角スペースを半角スペースに置換した後、キーワード検索
            bathList = bathRepository.searchBathList(keyword.replaceAll("　", " "));
        }
        return bathList;
    }

}
