package com.atguigu.controller;

import com.atguigu.pojos.Schedule;
import com.atguigu.result.PageResult;
import com.atguigu.result.Result;
import com.atguigu.service.SchedulerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 包名：com.atguigu.controller
 *
 * @author lct
 * 日期: 2023-09-11   18:20
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private SchedulerService schedulerService;
    @GetMapping("/{pageSize}/{pageNum}")
    public Result<PageResult<Schedule>> findPage(@PathVariable("pageSize") Integer pageSize,
                                                 @PathVariable("pageNum") Integer pageNum){
        return Result.ok(schedulerService.findPage(pageNum,pageSize));
    }
    @PostMapping
    public Result add(@RequestBody Schedule schedule){
        schedulerService.add(schedule);
        return Result.ok();
    }
    @PutMapping
    public Result update(@RequestBody Schedule schedule){
        schedulerService.update(schedule);
        return Result.ok();
    }
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id){
        schedulerService.delete(id);
        return Result.ok();
    }
}
