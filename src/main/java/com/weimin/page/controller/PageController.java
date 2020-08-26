package com.weimin.page.controller;

import com.weimin.page.common.Page;
import com.weimin.page.pojo.Book;
import com.weimin.page.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author weimin
 * @Date 2020/8/25 0025 21:29
 */
@Controller
public class PageController {
    @Autowired
    BookService bookService;

    @RequestMapping("/page")
    public String page(Model model, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "4") Integer pageSize){
        Page<Book> bookPage = bookService.page(pageNum, pageSize);
        model.addAttribute("bookPage",bookPage);
        return "index";
    }
}
