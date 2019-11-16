package com.c4c.oyfy.domain.bath;

import java.util.List;

import com.c4c.oyfy.app.search.ResultList;
import com.c4c.oyfy.app.top.TopForm;
import com.oyfy.dbflute.exentity.Bath;
import com.oyfy.dbflute.exentity.Review;
import com.oyfy.dbflute.exentity.Tag;


public interface BathRepository {
    /**
     * 検索条件を元に銭湯リストを取得
     * @param keyword
     * @param page
     * @param feeFrom
     * @param feeTo
     * @return
     */
    public ResultList findBathList(String keyword, Integer feeFrom, Integer feeTo, int page);

    /**
     * 銭湯IDを元に銭湯詳細を取得
     * @param bathId
     * @return
     */
    public Bath findBathDetail(int bathId);

    /**
     * 銭湯IDを元にタグ一覧を取得
     * @param bathId
     * @return
     */
    public List<Tag> findTagList(int bathId);

    /**
     * 銭湯登録
     * @return
     */
    public void registBath(Bath bath);

    public ResultList findNearbyBath(TopForm currentLocationForm);

    /**
     * レビュー登録
     * @return
     */
    public void registReview(Review review);

    /**
     * 銭湯IDを元にコメントを取得
     * @param bathId
     * @return
     */
    public List<Review> findReviewList(int bathId);
}
