package com.atguigu.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 包名：com.atguigu.result
 *
 * @author lct
 * 日期: 2023-09-10   16:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private List<T> data;
//    每页大小
    private Integer pageSize;
    private Long total;
//    当前页的页码
    private Integer currentPage;

}
