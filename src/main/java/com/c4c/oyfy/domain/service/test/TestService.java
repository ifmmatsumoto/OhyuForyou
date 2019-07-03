package com.c4c.oyfy.domain.service.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.domain.repository.test.TestRepository;
import com.oyfy.dbflute.exentity.Bath;

@Service
@Transactional
public class TestService {

    final TestRepository testRepository;

    @Autowired
    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    public int test() {
        return testRepository.test();
    }

    public List<Bath> searchPathList(String keyword) {
        return testRepository.searchPathList(keyword);

    }
}
