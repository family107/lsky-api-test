package com.family.lsky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName MainApplication
 * @Date 2023-06-10 9:02
 * @AUTHOR family
 **/
@SpringBootApplication
@EnableFeignClients
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
