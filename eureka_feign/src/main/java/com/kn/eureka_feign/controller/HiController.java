package com.kn.eureka_feign.controller;

import com.kn.eureka_feign.clients.FeignServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HiController
 * @Description TODO:
 * @Date: 2019/8/5 10:54
 * @Author: Kn
 */
@RestController
public class HiController {

    @Autowired
    FeignServiceClient feignServiceClient;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return feignServiceClient.sayHiFromClientOne(name);
    }
}
