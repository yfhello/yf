package com.example.eurekaserverone;

import com.example.eurekaserverone.config.MyConfig;
import com.example.eurekaserverone.config.People;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(new Class[]{EurekaServerOneApplication.class, MyConfig.class}, args);
    }


}
