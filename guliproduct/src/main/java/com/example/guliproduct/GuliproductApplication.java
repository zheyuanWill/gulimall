package com.example.guliproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.guliproduct.product.dao")
public class GuliproductApplication {

    public static void main(String[] args) {

        SpringApplication.run(GuliproductApplication.class, args);
    }


}
