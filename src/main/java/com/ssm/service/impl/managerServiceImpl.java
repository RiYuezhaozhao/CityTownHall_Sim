package com.ssm.service.impl;

import com.ssm.dao.managerDao;
import com.ssm.domain.manager;
import com.ssm.service.managerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class managerServiceImpl implements managerService {

    @Autowired
    private managerDao managerDao;

    @Override
    public boolean select(String username, String password) {
        manager manager=managerDao.selectByUserName(username);
        if (manager !=null && manager.getPassword().equals(password)){
            return true;
        }
            return false;
    }


    @Override
    public boolean register(manager manager) {
        manager manager1 = managerDao.selectByUserName(manager.getUsername());
        if (manager1 != null) {
            return false;
        }
        return managerDao.register(manager);

    }

    @Override
    public manager selectByUserName(String username) {
        return null;
    }
}
