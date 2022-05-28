package com.valent.notebook.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class NoteMvcConfigurer implements WebMvcConfigurer{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
