package com.chessiq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = "com.chessiq")
@EnableJpaRepositories(basePackages = "com.chessiq.repository")
@EntityScan(basePackages = "com.chessiq.model")
public class ChessiqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChessiqApplication.class, args);
    }
}