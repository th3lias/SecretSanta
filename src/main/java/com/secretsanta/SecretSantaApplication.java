package com.secretsanta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories(basePackages = "com.secretsanta.Repository")
public class SecretSantaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecretSantaApplication.class, args);
    }
}
