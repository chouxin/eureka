package com.example.democlent1.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public String hello(){
        return "hello xxx，this is demo-client1 messge";
    }
    /*
        服务提供者
     */
    @RequestMapping("/producerHello")
    public String hello(@RequestParam("name") String name){
        return "hello " + name + "，this is demo-client1 messge";
    }
    /*
        服务提供者-多参数
     */
    @RequestMapping("/producerHelloUser")
    public String helloUser(@RequestParam("name") String name,@RequestParam("age") int age){
        return "hello " + name+ "，this is demo-client1 messge,  age is " + age;
    }

}
