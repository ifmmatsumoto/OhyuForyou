package com.c4c.oyfy.domain.bath;

import com.c4c.oyfy.app.resultlist.ResultList;

public interface BathRepository {
	/**
	 * キーワードを元に銭湯リストを取得
	 * @param keyword
	 * @param page
	 * @return
	 */
	public ResultList getBathList(String keyword, int page);
}
