package com.dario.car.server.service.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.dario.car.server.domain.mybatis.mapper")
public class CarServerServiceAdminApplication {

    public static void main(String[] args) {

        SpringApplication.run(CarServerServiceAdminApplication.class, args);
    }
}
