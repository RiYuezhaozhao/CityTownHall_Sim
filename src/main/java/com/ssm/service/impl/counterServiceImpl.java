package com.ssm.service.impl;

import com.ssm.dao.CounterDao;
import com.ssm.domain.counter;
import com.ssm.service.counterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class counterServiceImpl implements counterService {

    @Autowired
    private CounterDao counterDao;



    public boolean save(counter counter) {
        return counterDao.save(counter) >0;

    }

    public boolean update(counter counter) {
       return counterDao.update(counter) >0;

    }

    public boolean delete(Integer counterId) {
      return counterDao.delete(counterId) >0;

    }

    public counter getByCounterId(Integer counterId) {
        return counterDao.getByCounterId(counterId);
    }

    public List<counter> getAll() {
        return counterDao.getAll();
    }


    public boolean deleteByIds(int[] counterIds) {
        return counterDao.deleteByIds(counterIds);
    }
}
