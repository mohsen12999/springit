package com.mohsen.springit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit!");
    }

    @Bean
    @Profile("dev")
    CommandLineRunner runner() {
        return args -> System.out.println("This is something that we would only do in dev.");
    }
}
