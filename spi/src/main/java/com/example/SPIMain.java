package com.example;

import java.util.ServiceLoader;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class SPIMain {

    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        for (HelloService h : loader) {
            System.out.println(h.sayHello("world"));
        }

    }
}
