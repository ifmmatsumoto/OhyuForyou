package com.c4c.oyfy.domain.repository;

import java.util.List;

import com.oyfy.dbflute.exentity.Bath;

public interface BathRepository {
	/** 銭湯リストを取得 */
	public List<Bath> getBathList();
	public Bath findBath(int bathId);
}
