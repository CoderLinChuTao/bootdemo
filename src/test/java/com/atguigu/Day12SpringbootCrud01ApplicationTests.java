package com.atguigu;

import   com.atguigu.mapper.ScheduleMapper;
import com.atguigu.pojos.Schedule;
import com.atguigu.result.PageResult;
import com.atguigu.service.SchedulerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Day12SpringbootCrud01Application.class)
@Slf4j
class Day12SpringbootCrud01ApplicationTests {
    @Autowired
    private ScheduleMapper scheduleMapper;
    @Autowired
    private SchedulerService schedulerService;
    @Test
    public void testFindAll(){
        log.info(scheduleMapper.findAll().toString());
    }
    @Test
    public void testFindPage(){
        PageResult<Schedule> pageResult = schedulerService.findPage(1, 3);
        log.info("查询到的分页数据是{}",pageResult);
    }

}
