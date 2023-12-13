package com.ssm.service;
import com.ssm.domain.counter;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
@Transactional

public interface counterService {


    public boolean save(counter counter);


    public boolean update(counter counter);

    public boolean delete(Integer counterId);


    public counter getByCounterId(Integer counterId);


    public List<counter> getAll();

    public boolean deleteByIds(int[] counterIds);
}