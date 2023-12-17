package com.ssm.service;

import com.ssm.domain.manager;

public interface managerService {


    boolean select(String username, String password);

   manager selectByUserName(String username);

    public boolean register(manager manager);
}
