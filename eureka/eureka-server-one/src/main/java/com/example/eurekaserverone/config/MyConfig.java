package com.example.eurekaserverone.config;

import org.springframework.context.annotation.Bean;

public class MyConfig {

    @Bean
    public People people(){
        return new People();
    }
}
