package com.dongyulong.eurekaanatomy.eurekaserver01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 14:49
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer01Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer01Application.class,args);
    }
}
