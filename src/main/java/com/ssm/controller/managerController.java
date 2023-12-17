package com.ssm.controller;


import com.ssm.domain.manager;
import com.ssm.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("manager")
public class managerController {


    @Autowired
    private managerService managerService;

    //登录
    @PostMapping("/select")
    public Result select(@RequestParam String username, @RequestParam String password) {
        boolean flag = managerService.select(username,password);
        return new Result(flag ? Code.LOGIN_OK : Code.LOGIN_ERR,flag);
    }
    //注册
    @PostMapping("/register")
    public Result register(@RequestBody manager manager){
        boolean flag = managerService.register(manager);
        return new Result(flag ? Code.REGISTER_OK : Code.REGISTER_ERR,flag);
        }
    }



