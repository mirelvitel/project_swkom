package org.example.swkomproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"org.example.swkomproject.cors", "org.example.swkomproject.components"})
public class SwkomProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwkomProjectApplication.class, args);
    }
}
