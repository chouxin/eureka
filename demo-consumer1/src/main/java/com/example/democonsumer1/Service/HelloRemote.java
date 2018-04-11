package com.example.democonsumer1.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @see name:远程服务名，即spring.application.name配置的名称
 *
 */

@Service
@FeignClient(name = "demo-clent")
public interface HelloRemote {
    //需要匹配服务提供者接口名称
    @RequestMapping(value = "/producerHello")
    public String sayHello(@RequestParam(value="name") String name);
}
