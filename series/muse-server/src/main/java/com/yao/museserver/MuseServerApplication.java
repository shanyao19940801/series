package com.yao.museserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MuseServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseServerApplication.class, args);
    }
}
