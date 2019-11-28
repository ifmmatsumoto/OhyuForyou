package com.c4c.oyfy.domain.illust;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyfy.dbflute.exentity.Tag;

@Transactional
@Service
public class IllustSearchService {

    @Autowired
    public IllustSearchRepository illustSearchRepository;
    /**
     * イラストタグ検索
     * @return
     */
    public List<Tag> findAllTag() {
        return illustSearchRepository.findAllTag();
    }
}
