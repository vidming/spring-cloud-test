package com.bj1901.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 17:40
 */
// @EnableDiscoveryClient
// @SpringBootApplication

@EnableFeignClients(basePackages = "com.bj1901.api.feign_interface")
@ComponentScan(basePackages= {"com.bj1901.api.feign_interface","com.bj1901.consumer"})
@SpringCloudApplication
public class ConsumerFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignApp.class, args);
    }

}
