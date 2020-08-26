package com.weimin.page.mapper;

import com.weimin.page.pojo.Book;
import com.weimin.page.pojo.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author weimin
 * @Date 2020/8/25 0025 20:57
 */
@Mapper
public interface BookMapper {
    long countByExample(BookExample example);

    int deleteByExample(BookExample example);

    int insert(Book record);

    int insertSelective(Book record);

    List<Book> selectByExample(BookExample example);

    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    int count();

    List<Book> page(@Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);
}