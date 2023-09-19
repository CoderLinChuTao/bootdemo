package com.atguigu.service.impl;

import com.atguigu.anno.InvokeTime;
import com.atguigu.mapper.ScheduleMapper;
import com.atguigu.pojos.Schedule;
import com.atguigu.result.PageResult;
import com.atguigu.service.SchedulerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 包名：com.atguigu.service.impl
 *
 * @author lct
 * 日期: 2023-09-11   16:52
 */
@Service
public class SchedulerServiceImpl implements SchedulerService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    @Override
    public PageResult<Schedule> findPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Schedule> scheduleList = scheduleMapper.findAll();
//        封装结果集
        PageInfo pageInfo = new PageInfo<>(scheduleList, 10);
        return new PageResult<>(pageInfo.getList(), pageInfo.getPageSize(), pageInfo.getTotal(), pageInfo.getPageNum());
    }

    @Override
    public void add(Schedule schedule) {
        scheduleMapper.addSchedule(schedule);
    }

    @InvokeTime
    @Override
    public void update(Schedule schedule) {
        scheduleMapper.updateSchedule(schedule);
    }

    @InvokeTime
    @Override
    public void delete(Integer id) {
        scheduleMapper.deleteScheduleById(id);
    }

    @Override
    public List<Schedule> findScheduleListByCompleted(Boolean completed) {
        return scheduleMapper.findScheduleListByCompleted(completed);
    }
}
