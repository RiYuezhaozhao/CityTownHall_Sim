package com.ssm.controller;

import com.ssm.domain.counter;
import com.ssm.domain.people;
import com.ssm.service.peopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class queueController {

    @Autowired
    private peopleService peopleService;
    //生成随机人群
    @GetMapping("/generate")
    public Result generatePeople (@RequestParam int count){
        List<people> countList =peopleService.randomPeople(count);
        Integer code=countList !=null ? Code.GET_OK :Code.GET_ERR;
        String msg=countList !=null ?"":"数据生成失败";
        return new Result(code,countList,msg);
    }
}
