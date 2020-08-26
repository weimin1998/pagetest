package com.weimin.page.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author weimin
 * @Date 2020/8/25 0025 17:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Page<T> {

    private static Integer PAGE_SIZE = 4;
    private Integer pageNum;

    private Integer pageTotal;

    private Integer pageSize = PAGE_SIZE;

    private Integer records;

    private List<T> data;
}
