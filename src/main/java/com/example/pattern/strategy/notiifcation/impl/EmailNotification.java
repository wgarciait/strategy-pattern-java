package com.example.pattern.strategy.notiifcation.impl;

import com.example.pattern.strategy.dto.StrategyDTO;
import com.example.pattern.strategy.notification.Notification;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements Notification {
    @Override
    public StrategyDTO execute() {
        return StrategyDTO.builder().strategy("Implementação EmailNotification").build();
    }

    @Override
    public String getType() {
        return "email";
    }
}
