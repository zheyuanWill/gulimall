package com.example.guliproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.example.guliproduct.product.dao")
public class GuliproductApplication {

    public static void main(String[] args) {

        SpringApplication.run(GuliproductApplication.class, args);
    }


}
