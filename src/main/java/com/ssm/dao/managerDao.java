package com.ssm.dao;

import com.ssm.domain.manager;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface managerDao {

    //登录
    @Select("select *from manager where username=#{username} and password=#{password}")
    manager select(@Param("username") String username,@Param("password") String password);


    @Select("select * from manager where username=#{username}")
    manager selectByUserName(@Param("username") String username);


    //注册
    @Insert("insert into manager value (null, #{username},#{password})")
    boolean register(manager manager);
}
