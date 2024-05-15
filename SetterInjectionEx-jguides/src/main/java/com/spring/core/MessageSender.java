package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService smsService;
    private MessageService emailService;

    @Autowired
    public void setSmsService(@Qualifier("smsService") MessageService smsService) {
        this.smsService = smsService;
        System.out.println("sms service setter injection...!");
    }
    @Autowired
    public void setEmailService(@Qualifier("emailService") MessageService emailService) {
        this.emailService = emailService;
        System.out.println("email service setter injection...!");
    }

    public void sendMessage(String message) {
        this.smsService.sendMessage(message);
        this.emailService.sendMessage(message);
    }
}
