package com.valent.notebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class NotebookApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotebookApplication.class, args);
    }

}
