package com.example.consumerone.controller;

import com.example.consumerone.bean.People;
import com.example.consumerone.feignclient.IProviderController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ConsumerController implements IConsumerController {

    @Autowired
    private IProviderController providerController;
    private static final Logger logger = LogManager.getLogger(ConsumerController.class);

    public String test(String name) {
        logger.trace("test trace");
        logger.debug("test debug");
        logger.info("test info");
        logger.warn("test warn");
        logger.error("test error");
        return "test: " + name;
    }

    @Override
    public People getPeople(People people) {
        System.out.println(people.getBornthSate());
        return people;
    }

    @Override
    public Date getDate(Date date) {
        System.out.println(date);
        return date;
    }

    @Override
    public String getUuid(String name) {
        String uuid = providerController.getUuid();
        return uuid;
    }
}
