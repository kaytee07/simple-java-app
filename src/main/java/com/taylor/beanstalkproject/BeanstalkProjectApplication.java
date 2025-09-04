package com.taylor.beanstalkproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BeanstalkProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanstalkProjectApplication.class, args);
    }

    @GetMapping("/")
    public String index() {
        return "Hello World! Kofi Taylor Winful. A backend engineer!";
    }

}
