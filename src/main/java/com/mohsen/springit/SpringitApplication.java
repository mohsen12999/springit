package com.mohsen.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit!");
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("error log");
            log.warn("warn log");
            log.info("info log");
            log.debug("debug log");
            log.trace("trace log");
        };
    }
}
