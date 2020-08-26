package com.weimin.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author weimin
 * @Date 2020/8/26 0026 16:11
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "redirect:/page";
    }
}
