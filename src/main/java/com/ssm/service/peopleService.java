package com.ssm.service;

import com.ssm.domain.people;

import java.util.List;

public interface peopleService {
    //生成随机人群
    public List<people> peopleRando(int numberPeople);

    List<people> randomPeople(int count);
}
