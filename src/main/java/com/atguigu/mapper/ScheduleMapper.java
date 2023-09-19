package com.atguigu.mapper;

import com.atguigu.pojos.Schedule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 包名：com.atguigu.mapper
 *
 * @author lct
 * 日期: 2023-09-11   16:00
 */
@Mapper
public interface ScheduleMapper {
    List<Schedule> findAll();
    void addSchedule(Schedule schedule);
    void deleteScheduleById(Integer id);
    void updateSchedule(Schedule schedule);

    List<Schedule> findScheduleListByCompleted(Boolean completed);
}
