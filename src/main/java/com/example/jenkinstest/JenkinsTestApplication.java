package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {

    @GetMapping("/getMessage")
    public String getMessage() {
        return "Hello...";
    }

    public static void main(String[] args) {
        System.out.printf("Starting ... the server ");
        SpringApplication.run(JenkinsTestApplication.class, args);
        System.out.printf("Startingdfsasfas ... the server ");

    }

}
