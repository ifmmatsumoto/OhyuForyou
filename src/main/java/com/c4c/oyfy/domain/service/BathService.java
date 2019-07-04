package com.c4c.oyfy.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.domain.repository.BathRepository;
import com.oyfy.dbflute.exentity.Bath;

@Service
@Transactional
public class BathService {

	@Autowired
    BathRepository bathRepository;

	/** 銭湯リストを取得 */
    public List<Bath> getBathList() {
        return bathRepository.getBathList();
    }
}
