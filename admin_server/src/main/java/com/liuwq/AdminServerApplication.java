package com.liuwq;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class AdminServerApplication {

    /**
     * http://localhost:8769
     * http://localhost:8769/#/wallboard
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run( AdminServerApplication.class, args );
    }

}

