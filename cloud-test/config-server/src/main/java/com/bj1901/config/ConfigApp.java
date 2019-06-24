package com.bj1901.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: adming
 * @Date: 2019/6/24 0024 10:56
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigApp.class, args);
    }
}
