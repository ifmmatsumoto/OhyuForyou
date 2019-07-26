package com.c4c.oyfy.domain.bath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c4c.oyfy.util.OyfyConst;
import com.c4c.oyfy.util.ResultList;
import com.oyfy.dbflute.exbhv.BathBhv;


@Repository
public class BathRepositoryImpl extends OyfyConst implements BathRepository {

    @Autowired
    BathBhv BathBhv;

    /**
     * 銭湯リストを取得
     * @param page
     * @return
     */
    @Override
    public ResultList getBathList(int page) {
        // ページ情報を含めた検索結果
        ResultList resultList = new ResultList();
        resultList.setPage(BathBhv.selectPage(cb -> {
            // TODO 検索条件を指定
            cb.query().addOrderBy_BathId_Asc();
            cb.paging(PAGE_SIZE, page); // 表示件数, 表示ページ数
        }));
        return resultList;
    }
}
