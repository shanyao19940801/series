package com.yao.proxys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProxysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxysApplication.class, args);
    }
}
