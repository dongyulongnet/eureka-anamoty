package com.dongyulong.eurekaanatomy.serviceconsumer01.controller;

import com.dongyulong.eurekaanatomy.serviceconsumer01.service.ServiceProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 15:32
 */
@RestController
public class HelloController {

    @Resource
    ServiceProvider serviceProvider;

    @GetMapping("/hello")
    public String hello() {
        return serviceProvider.hello();
    }
}
