package com.example.eurekaserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerOneApplication {

    public static void main(String[] args) {
//        System.out.println(JacksonXmlAnnotationIntrospector.class);
        SpringApplication.run(EurekaServerOneApplication.class, args);
    }


}
