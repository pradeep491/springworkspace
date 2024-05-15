package com.spring.core;

import org.springframework.stereotype.Component;

@Component
public interface MessageService {
    void sendMessage(String message);
}
