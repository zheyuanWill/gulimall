package com.example.guliware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.guliware.ware.dao")
@EnableTransactionManagement
@EnableFeignClients
@EnableRabbit
public class GuliwareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliwareApplication.class, args);
    }

}
