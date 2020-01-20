package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserApplication2000 {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication2000.class);
    }
}
