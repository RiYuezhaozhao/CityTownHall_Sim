package com.ssm.controller;

import com.ssm.domain.counter;
import com.ssm.service.counterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
public class CounterController {

    @Autowired
    private counterService counterService;

    //查询所有
    @GetMapping
    public Result getAll (){
        List<counter> counterList =counterService.getAll();
        Integer code=counterList !=null ? Code.GET_OK :Code.GET_ERR;
        String msg=counterList !=null ?"":"数据查询失败";
        return new Result(code,counterList,msg);
    }

    //添加
    @PostMapping("/sava")
    public Result save(@RequestBody counter counter) {
        boolean flag = counterService.save(counter);
          return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR,flag);
    }
    //修改
    @PutMapping("update")
    public Result update(@RequestBody counter counter) {
        boolean flag = counterService.update(counter);
         return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR,flag);

    }
    //删除
    @DeleteMapping("delete/{counterId}")
    public Result delete(@PathVariable Integer counterId) {
        boolean flag = counterService.delete(counterId);
         return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);

    }
    //id查询
    @GetMapping("getByCounterId/{counterId}")
    public Result getByCounterId(@PathVariable Integer counterId) {
        counter counter=counterService.getByCounterId(counterId);
        Integer code=counter !=null ? Code.GET_OK :Code.GET_ERR;
        String msg=counter !=null ?"":"数据查询失败";
        return new Result(code,counter,msg);
    }
    //批量删除
    @DeleteMapping("deleteByIds/")
    public Result deleteByIds(@RequestBody String[] counterId) {
        boolean flag=counterService.deleteByIds(counterId);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }
    //条件查询
    @GetMapping("select/")
    public Result selectByCondition (){
        List<counter> counterList =counterService.selectByCondition();
        Integer code=counterList !=null ? Code.GET_OK :Code.GET_ERR;
        String msg=counterList !=null ?"":"数据查询失败";
        return new Result(code,counterList,msg);
    }

    //按状态查询
    @GetMapping("selectCounter/")
    public Result selectCounter(){
        int status = 1;
        List<counter> counterList =counterService.selectCounter(status);
        Integer code=counterList !=null ? Code.GET_OK :Code.GET_ERR;
        String msg=counterList !=null ?"":"数据查询失败";
        return new Result(code,counterList,msg);
    }
}
