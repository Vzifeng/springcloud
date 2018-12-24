package com.example.producer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author   ：yangyunlong.
 * @ Date     ：Created in 11:31 2018/12/24
 * @Version ： $version$
 */
@Controller
public class TestController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String test(@RequestParam String name){
        return "hello world"+name;
    }
}
