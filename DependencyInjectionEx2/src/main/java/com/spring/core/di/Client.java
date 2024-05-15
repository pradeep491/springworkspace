package com.spring.core.di;

public class Client {
    public static void main(String[] args) {
        String message = "Hello Spring";
        MessageService service = new EmailService();
        MessageSender sender = new MessageSender(service);
        sender.sendMessage(message);
    }
}
