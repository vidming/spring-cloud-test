package com.bj1901.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: adming
 * @Date: 2019/6/18 0018 17:09
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.bj1901.provider.dao")
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }

}
