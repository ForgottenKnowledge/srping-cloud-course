package com.example.cientupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClientUpdaterApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientUpdaterApp.class, args);
    }
}
