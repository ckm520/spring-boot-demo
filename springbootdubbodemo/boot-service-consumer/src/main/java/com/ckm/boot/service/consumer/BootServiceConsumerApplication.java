package com.ckm.boot.service.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class BootServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootServiceConsumerApplication.class, args);
    }

}
