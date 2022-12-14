package com.corbandalas.dworkin.dworkinconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DworkinConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DworkinConfigApplication.class, args);
    }

}
