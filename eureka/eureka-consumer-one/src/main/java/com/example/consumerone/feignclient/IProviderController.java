package com.example.consumerone.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-provider")
public interface IProviderController {

    @RequestMapping("/provider/getUuid")
    String getUuid();
}
