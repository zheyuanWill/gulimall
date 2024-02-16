package com.example.gulisearch.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulisearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulisearchApplication.class, args);
    }

}
