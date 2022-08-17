package com.mohsen.springit;

import com.mohsen.springit.model.Comment;
import com.mohsen.springit.model.Link;
import com.mohsen.springit.repository.CommentRepository;
import com.mohsen.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Welcome to Springit!");
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 link is awesome", link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println("We just insert link and comment");
        };
    }
}
