package com.corbandalas.dworkin.dworkindiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DworkinDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DworkinDiscoveryApplication.class, args);
    }

}
