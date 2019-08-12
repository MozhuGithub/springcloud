package com.kn.eureka_feign.clients;

import com.kn.eureka_feign.component.FeignServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName: FeignServiceClient
 * @Description TODO: 调用EurekaClient的服务，Feign采用声明式调用，且接口会利用动态代理实现（类似于JPA）
 * @Date: 2019/8/5 10:42
 * @Author: Kn
 */
@FeignClient(value = "eureka-client",fallback = FeignServerHystrix.class)
public interface FeignServiceClient {
    @GetMapping( "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
