package com.example.consumerone.controller;

import com.example.consumerone.bean.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.Produces;
import java.util.Date;

@RequestMapping("/consumer")
@Produces("application/json")
public interface IConsumerController {

    @GetMapping("/test")
    String test(String name);

    @GetMapping("/getPeople")
    People getPeople(People people);

    @GetMapping("/getDate")
    Date getDate(Date date);
}
