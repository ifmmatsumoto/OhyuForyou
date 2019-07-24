package com.c4c.oyfy.domain.bath;

import java.util.List;

import com.oyfy.dbflute.exentity.Bath;

public interface BathRepository {
	/** 銭湯リストを取得 */
	public List<Bath> getBathList();
}
