package com.c4c.oyfy.domain.bath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.util.ResultList;

@Service
@Transactional
public class BathService {

	@Autowired
    BathRepository bathRepository;

	/**
	 * 銭湯リストを取得
	 * @param page
	 * @return
	 */
    public ResultList getBathList(int page) {
        return bathRepository.getBathList(page);
    }
}
