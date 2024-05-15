package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService smsService;

    @Autowired
    public MessageSender(@Qualifier("smsService") MessageService service) {
        this.smsService = service;
        System.out.println("constructor based dependency injection...!");
    }

    public void sendMessage(String message) {
        this.smsService.sendMessage(message);
    }
}
