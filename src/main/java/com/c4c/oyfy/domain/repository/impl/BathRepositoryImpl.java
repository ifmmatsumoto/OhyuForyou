package com.c4c.oyfy.domain.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.c4c.oyfy.domain.repository.BathRepository;
import com.oyfy.dbflute.exbhv.BathBhv;
import com.oyfy.dbflute.exentity.Bath;


@Repository
public class BathRepositoryImpl implements BathRepository {

	@Autowired
	BathBhv BathBhv;

	/** 銭湯リストを取得 */
	@Override
	public List<Bath> getBathList() {
		// 銭湯ID順で銭湯リストを取得
		return BathBhv.selectList(cb -> {
			cb.query().addOrderBy_BathId_Asc();
		});
	}
}
