package com.weimin.page.service;


import com.weimin.page.common.Page;
import com.weimin.page.mapper.BookMapper;
import com.weimin.page.pojo.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author weimin
 * @Date 2020/8/25 0025 17:06
 */
@Service
public class BookService {

    @Resource
    BookMapper bookMapper;

    public Integer count(){
        return bookMapper.count();
    }
    public Page<Book> page(Integer pageNum, Integer pageSize){
        Page<Book> bookPage = new Page<>();

        //一页显示几条数据
        bookPage.setPageSize(pageSize);
        //总的数据量
        Integer count = count();
        bookPage.setRecords(count);

        //
        bookPage.setPageNum(pageNum);

        //总页数
        Integer pageTotal = count%pageSize==0? count/pageSize:count/pageSize+1;
        bookPage.setPageTotal(pageTotal);
        //具体的数据
        bookPage.setData(bookMapper.page((pageNum-1)*pageSize,pageSize));

        return bookPage;
    }

}
