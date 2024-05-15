package com.spring.core.di;

public class MessageSender {
    private MessageService service;

    public MessageSender(MessageService service) {
        this.service = service;
    }

    public void sendMessage(String message) {
        this.service.sendMessage(message);
    }
}
