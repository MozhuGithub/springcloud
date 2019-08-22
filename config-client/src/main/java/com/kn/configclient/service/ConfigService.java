package com.kn.configclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: configService
 * @Description TODO:
 * @Date: 2019/8/14 18:50
 * @Author: Kn
 */
@Service
public class ConfigService {
    @Autowired
    private RestTemplate restTemplate;

    public String getPort(){
        return restTemplate.getForObject("http://CONFIG-SERVER/hi",String.class);
    }
}
