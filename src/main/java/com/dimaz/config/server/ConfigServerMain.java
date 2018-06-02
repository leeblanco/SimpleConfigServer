package com.dimaz.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerMain {

    public static void main (String [] arg) {
        SpringApplication.run(ConfigServerMain.class, arg);
    }
}
