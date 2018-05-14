package com.anthony.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by BG343891 on 2018/5/14.
 */
@RestController
public class DemoAction {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return restTemplate.getForObject("http://CLOUD-CLIENT/demo?name=" + name, String.class);
    }
}
