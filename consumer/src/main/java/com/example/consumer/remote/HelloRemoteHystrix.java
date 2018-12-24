package com.example.consumer.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author   ：yangyunlong.
 * @ Date     ：Created in 13:57 2018/12/24
 * @Version ： $version$
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "fail:"+name;
    }
}
