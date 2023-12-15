package com.ssm.service.impl;

import com.ssm.domain.people;
import com.ssm.service.peopleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Service

public class peopleServiceImpl implements peopleService {

    //生成随机人群
    @Override
    public List<people> peopleRando(int numberPeople) {
        return null;
    }

    @Override
    public List<people> randomPeople(int numberPeople) {
        List<people> people = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberPeople; i++) {
            String name = "Person_" + (i + 1);
            String[] serviceTypes={"紧急","日常"};
            String serviceType = "Type_" + serviceTypes[random.nextInt(serviceTypes.length)];
            int time = random.nextInt(60) + 1; // 假设时间在1到60分钟之间
            people.add(new people(name, serviceType, time));
            System.out.println(people);
        }
        return people;
    }

}


