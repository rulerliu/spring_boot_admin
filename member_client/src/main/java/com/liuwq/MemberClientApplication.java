package com.liuwq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberClientApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}