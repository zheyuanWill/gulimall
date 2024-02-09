package com.example.guligateway.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//排除和数据源有关配置因为网关gateway不需要
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GuligatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuligatewayApplication.class, args);
    }

}
