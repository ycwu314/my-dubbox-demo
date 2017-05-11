package com.example.dubbox;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class Boostrap2 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            new String[]{"META-INF/spring/dubbo-provider.xml"});
        context.start();

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
