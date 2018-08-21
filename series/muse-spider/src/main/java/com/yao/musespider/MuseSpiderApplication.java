package com.yao.musespider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yao.musespider.dao")
@EnableFeignClients
public class MuseSpiderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseSpiderApplication.class, args);
    }
}
