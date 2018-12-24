package com.example.consumer.testController;

import com.example.consumer.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ Author   ：yangyunlong.
 * @ Date     ：Created in 11:47 2018/12/24
 * @Version ： $version$
 */
@Controller
public class Test {
    @Autowired
    HelloRemote helloRemote;
    @RequestMapping(value = "/hello/{name}")
    @ResponseBody
    public String index(@PathVariable("name") String name){
        return  helloRemote.hello(name);
    }
}
