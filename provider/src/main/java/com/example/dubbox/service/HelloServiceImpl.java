package com.example.dubbox.service;

import com.example.dubbox.api.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
@Component
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return String.format("hello %s from %s", name, System.getProperty("provider.id"));
    }

}
