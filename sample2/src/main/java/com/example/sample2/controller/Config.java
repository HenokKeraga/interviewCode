package com.example.sample2.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {

    @Bean
    public String getString(){
        return new String();
    }
}
