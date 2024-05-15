package com.spring.core.di;

public class Client {
    public static void main(String[] args) {
        String message = "Hello Spring";
        SMSService service = new SMSService();
        MessageSender sender = new MessageSender(service);
        //EmailService service = new EmailService();
        sender.sendMessage(message);
    }
}
