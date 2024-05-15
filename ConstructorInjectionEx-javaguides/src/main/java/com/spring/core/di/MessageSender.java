package com.spring.core.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService smsService;
    private MessageService emailservice;
    //@Autowired
    public MessageSender(@Qualifier("smsService") MessageService service) {
        this.smsService = service;
        System.out.println("constructor based dependency injection...!");
    }
    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService emailService
            ,@Qualifier("smsService") MessageService smsService) {
        this.smsService = smsService;
        this.emailservice = emailService;
        System.out.println("constructor based dependency injection2...!");
    }

    public void sendMessage(String message) {
        this.smsService.sendMessage(message);
        this.emailservice.sendMessage(message);
    }
}
