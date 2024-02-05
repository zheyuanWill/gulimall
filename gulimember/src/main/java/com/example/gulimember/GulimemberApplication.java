package com.example.gulimember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.example.gulimember.member.feign")
public class GulimemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimemberApplication.class, args);
    }

}
