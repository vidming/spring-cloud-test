package com.bj1901.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: adming
 * @Date: 2019/6/24 0024 11:28
 */
@RestController
public class ConfigClientControllerTest {

    @Value("${server.port}")
    private String port;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaZone;
    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/config")
    public String toString() {
        return "RestController{" + "port='" + port + '\'' + ", eurekaZone='" + eurekaZone + '\'' + ", name='" + name
                + '\'' + '}';
    }

}
