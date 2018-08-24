package com.yao.musetestdatasoures;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class MuseTestDatasouresApplication {

    public static void main(String[] args) {
        SpringApplication.run(MuseTestDatasouresApplication.class, args);
    }
}
