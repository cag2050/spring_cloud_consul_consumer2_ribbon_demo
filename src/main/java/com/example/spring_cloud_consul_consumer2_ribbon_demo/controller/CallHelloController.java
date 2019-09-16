package com.example.spring_cloud_consul_consumer2_ribbon_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CallHelloController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    String hello() {
        return restTemplate.getForObject("http://service-producer/hello", String.class);
    }
}
