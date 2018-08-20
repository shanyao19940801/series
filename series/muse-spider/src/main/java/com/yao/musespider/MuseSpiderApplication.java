package com.yao.musespider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yao.musespider.dao")
public class MuseSpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseSpiderApplication.class, args);
    }
}
