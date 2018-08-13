package com.yao.musespider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MuseSpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseSpiderApplication.class, args);
    }
}
