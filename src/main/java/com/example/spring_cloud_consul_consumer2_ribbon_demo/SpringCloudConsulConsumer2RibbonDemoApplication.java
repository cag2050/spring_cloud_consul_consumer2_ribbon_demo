package com.example.spring_cloud_consul_consumer2_ribbon_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsulConsumer2RibbonDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsulConsumer2RibbonDemoApplication.class, args);
    }

}