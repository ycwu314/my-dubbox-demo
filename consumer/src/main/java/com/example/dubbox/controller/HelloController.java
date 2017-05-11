package com.example.dubbox.controller;

import com.example.dubbox.api.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String sayHello(@RequestParam String name){
        return helloService.sayHello(name);
    }
}
