package com.example.democlient2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    public String Hello(){
        return "hello xxx，this is demo-client2 messge";
    }

    /*
        服务提供者
     */
    @RequestMapping("/")
    public String Hello(@RequestParam("name") String name){
        return "hello " + name + "，this is demo-client2 messge";
    }



}


