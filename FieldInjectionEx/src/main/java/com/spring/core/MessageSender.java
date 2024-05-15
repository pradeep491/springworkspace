package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    @Qualifier("smsService")
    private MessageService smsService;
    @Autowired
    private MessageService emailService;
    public void sendMessage(String message) {
        this.smsService.sendMessage(message);
        this.emailService.sendMessage(message);
    }
}
