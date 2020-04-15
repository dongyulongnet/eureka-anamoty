package com.dongyulong.eurekaanatomy.serviceconsumer01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 15:29
 */
@SpringBootApplication
@EnableFeignClients
public class ServiceConsumer01Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer01Application.class,args);
    }
}
