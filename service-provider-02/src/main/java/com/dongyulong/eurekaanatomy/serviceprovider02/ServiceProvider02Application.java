package com.dongyulong.eurekaanatomy.serviceprovider02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 14:37
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceProvider02Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider02Application.class, args);
    }
}
