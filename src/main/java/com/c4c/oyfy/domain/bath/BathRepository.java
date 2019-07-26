package com.c4c.oyfy.domain.bath;

import com.c4c.oyfy.util.ResultList;

public interface BathRepository {
	/**
	 * 銭湯リストを取得
	 * @param page
	 * @return
	 */
	public ResultList getBathList(int page);
}
