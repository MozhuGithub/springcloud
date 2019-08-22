package com.kn.configclient.controller;

import com.kn.configclient.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigController
 * @Description TODO:
 * @Date: 2019/8/14 18:52
 * @Author: Kn
 */
@RefreshScope
@RestController
public class ConfigController {

    @Autowired
    private ConfigService configService;

    @Value("${foo}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        String port = configService.getPort();
        return port+"，foo属性："+foo;
    }
}
