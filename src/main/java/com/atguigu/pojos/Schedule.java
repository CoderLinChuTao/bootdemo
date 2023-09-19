package com.atguigu.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包名：com.atguigu.pojos
 *
 * @author lct
 * 日期: 2023-09-11   15:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private Integer id;
    private String title;
    private Boolean completed;
}
