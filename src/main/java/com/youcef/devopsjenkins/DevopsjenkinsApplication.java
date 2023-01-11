package com.youcef.devopsjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsjenkinsApplication {


        @GetMapping
        public String message(){
            return "here the las devoir ...CI CD with jenkins";
        }

    public static void main(String[] args) {
        SpringApplication.run(DevopsjenkinsApplication.class, args);
    }

}
