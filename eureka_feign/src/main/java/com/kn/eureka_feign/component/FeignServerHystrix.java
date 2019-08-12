package com.kn.eureka_feign.component;

import com.kn.eureka_feign.clients.FeignServiceClient;
import org.springframework.stereotype.Component;

/**
 * @ClassName: FeignServerHystrix
 * @Description TODO:
 * @Date: 2019/8/5 14:35
 * @Author: Kn
 */
@Component
public class FeignServerHystrix implements FeignServiceClient {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,error,"+name;
    }
}
