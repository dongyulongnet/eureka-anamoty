package com.dongyulong.eurekaanatomy.eurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 16:01
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer02Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer02Application.class,args);
    }
}
