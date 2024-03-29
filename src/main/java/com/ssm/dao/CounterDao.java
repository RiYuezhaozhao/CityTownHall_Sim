package com.ssm.dao;

import com.ssm.domain.counter;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CounterDao {

    //添加
    @Insert("insert into counter value (null,#{serviceType},#{employeeName},#{openTime},#{capacity},#{status})")
    public int save(counter counter);
    //修改
    @Update("update counter set serviceType=#{serviceType}, employeeName= #{employeeName},  openTime =#{openTime},capacity=#{capacity},status=#{status} where counterId=#{counterId}")
    public int update(counter counter);
    //删除
    @Delete("delete from counter where counterId=#{counterId}")
    public int delete(Integer counterId);
    //查找
    @Select("select * from counter where counterId=#{counterId}")
    public counter getByCounterId(Integer counterId);
    //查询
    @Select("select * from counter")
    public List<counter> getAll();

    //批量删除
    @Delete({
            "<script>",
            "delete from counter where counterId IN",
            "<foreach item='counterId' collection='counterId' open='(' separator=',' close=')'>",
            "#{counterId}",
            "</foreach>",
            "</script>"
    })
    public  boolean deleteByIds(@Param("counterId") String[] counterId);

    //条件查询
    @Select("SELECT * FROM counter WHERE status LIKE #{status} AND " +
            "serviceType LIKE #{serviceType} AND employeeName LIKE #{employeeName}")
    public List<counter> selectByCondition();

    //按状态查询
    @Select("select * from counter where status=#{status}")
    public List<counter> selectCounter(@Param("status") int status);
}
