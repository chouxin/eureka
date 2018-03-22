package com.example.democonsumer1.Controller;

import com.example.democonsumer1.Service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    /*
        消费者的接口，去调用服务提供者
        问题：只能使用@RequestMapping("/consumerHello/{name}")  @PathVariable("name")方法 不知道有没有其它方式代替？
     */
    @RequestMapping("/consumerHello/{name}")
    public String index(@PathVariable("name") String name){
        return helloRemote.sayHello(name);
    }
    //有问题的
//    @RequestMapping("/consumerHello2")
//    public String index2(@RequestParam("name") String name){
//        return helloRemote.sayHello(name);
//    }
    @RequestMapping("/info")
    public String info(){
        return " Hi,I am a consumer!";
    }
}
