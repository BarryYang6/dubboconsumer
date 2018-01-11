package com.hnair.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Consumer {
    public static void main (String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/sample-consumer.xml"});
        context.start();
        System.out.println("服务订阅成功");
        DubboProvider dubboProvider = (DubboProvider) context.getBean("dubboProvider");
        System.out.println(dubboProvider.sayHello("Barry Yang"));
    }
}
