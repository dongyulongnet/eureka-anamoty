package com.dongyulong.eurekaanatomy.serviceconsumer01.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-provider")
public interface ServiceProvider {

    @GetMapping(value = "/hello")
    String hello();
}
