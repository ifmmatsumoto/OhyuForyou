package com.c4c.oyfy.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.c4c.oyfy.domain.repository.TestRepository;

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
}
