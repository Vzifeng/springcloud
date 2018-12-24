package com.example.configgitclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author   ：yangyunlong.
 * @ Date     ：Created in 15:10 2018/12/24
 * @Version ： $version$
 */
@Controller
public class Test {
    @Value("${neo.hello}")
    private String hello;
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String test(){
        return this.hello;
    }
}
