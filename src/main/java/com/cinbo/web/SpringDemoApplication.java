package com.cinbo.web;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ServletComponentScan(basePackages="com.cinbo.web.servlets")
@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
}
