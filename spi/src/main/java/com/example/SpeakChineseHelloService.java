package com.example;

/**
 * Created by Administrator on 2017/4/24 0024.
 */
public class SpeakChineseHelloService implements HelloService {

    public String sayHello(String name) {
        return "你好, " + name;
    }
}
