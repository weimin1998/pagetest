package com.weimin.page.pojo;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author weimin
 * @Date 2020/8/25 0025 20:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String id;

    private String name;

    private String author;

    private BigDecimal price;
}