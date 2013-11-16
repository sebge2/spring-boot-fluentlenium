package com.bsb.incubator.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sebastien Gerard
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class HelloWebXml {

    public static void main(String[] args) {
        SpringApplication.run(HelloWebXml.class, args);
    }
}