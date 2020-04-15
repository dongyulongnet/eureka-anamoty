package com.dongyulong.eurekaanatomy.eurekaserver03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 16:28
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer03Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer03Application.class,args);
    }
}
