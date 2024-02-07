package com.example.jenkinstest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsTestApplication {
//    Logger logger = LoggerFactory.getLogger(JenkinsTestApplication.class);
    private static final Logger logger = LogManager.getLogger(JenkinsTestApplication.class);

    @GetMapping("/getMessage")
    public String getMessage() {
        return "Hello...";
    }

    public static void main(String[] args) {
        System.out.printf("Starting ... the server ");
        logger.info("Hello world");
        logger.info("we are in logger info mode");

        SpringApplication.run(JenkinsTestApplication.class, args);
        System.out.printf("Startingdfsasfas ... the server ");

    }

}
