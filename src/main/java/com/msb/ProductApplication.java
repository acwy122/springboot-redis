package com.msb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.msb.mapper")
public class ProductApplication {
    public static void main(String[] args) {
        SpringBootApplication.run(ProductApplication.class,args);
    }
}