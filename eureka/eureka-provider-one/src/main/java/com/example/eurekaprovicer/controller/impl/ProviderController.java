package com.example.eurekaprovicer.controller.impl;

import com.example.eurekaprovicer.controller.IProviderController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/provider")
public class ProviderController implements IProviderController {

    @Override
    @RequestMapping("/getUuid")
    public String getUuid() {
        return UUID.randomUUID().toString();
    }
}
