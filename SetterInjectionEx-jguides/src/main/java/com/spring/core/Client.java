package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Hello Spring";
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender sender = context.getBean(MessageSender.class);
        sender.sendMessage(message);
    }
}
