package com.yao.museconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MuseConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseConsumerApplication.class, args);
    }
}
