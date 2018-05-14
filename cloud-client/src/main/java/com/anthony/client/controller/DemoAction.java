package com.anthony.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BG343891 on 2018/5/14.
 */

@RestController
public class DemoAction {


    @Value("${server.port}")
    String port;

    @RequestMapping("/demo")
    public String demo(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

}
