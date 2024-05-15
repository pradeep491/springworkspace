package com.spring.core.di;

public class MessageSender {
    private SMSService service;
    //private EmailService service1;

    public MessageSender(SMSService service){
        this.service = service;
    }
    public void sendMessage(String message){
        this.service.sendMessage(message);
    }
    /*public MessageSender(EmailService emailService){
        this.service1 = emailService;
    }
    public void sendMessage(String message){
        this.service1.sendMessage(message);
    }*/
}
