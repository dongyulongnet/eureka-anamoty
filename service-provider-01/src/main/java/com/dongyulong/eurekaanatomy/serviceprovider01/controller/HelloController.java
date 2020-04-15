package com.dongyulong.eurekaanatomy.serviceprovider01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dong YL
 * @version V1.0 2020/4/13 15:27
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "service-provider-01";
    }
}
