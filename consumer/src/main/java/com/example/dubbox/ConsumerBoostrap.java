package com.example.dubbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by Administrator on 2017/4/18 0018.
 */
@SpringBootApplication
@ImportResource("classpath:/META-INF/spring/dubbo-consumer.xml")
public class ConsumerBoostrap {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBoostrap.class, args);
    }
}
