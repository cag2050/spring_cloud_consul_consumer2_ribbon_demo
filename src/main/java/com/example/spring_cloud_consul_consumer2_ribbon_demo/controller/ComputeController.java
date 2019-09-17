package com.example.spring_cloud_consul_consumer2_ribbon_demo.controller;

import com.example.spring_cloud_consul_consumer2_ribbon_demo.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputeController {
    @Autowired
    ComputeService computeService;

    @RequestMapping("/add")
    String add(){
        return computeService.addService();
    }
}
