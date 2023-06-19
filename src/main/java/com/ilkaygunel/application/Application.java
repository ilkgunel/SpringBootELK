package com.ilkaygunel.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ilkaygunel.*"})
@EnableElasticsearchRepositories(basePackages = "com.ilkaygunel.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
