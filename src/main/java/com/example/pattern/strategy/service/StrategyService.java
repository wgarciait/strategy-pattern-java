package com.example.pattern.strategy.service;

import com.example.pattern.strategy.dto.StrategyDTO;
import com.example.pattern.strategy.factory.StrategyFactory;
import com.example.pattern.strategy.notification.Notification;
import org.springframework.stereotype.Service;

@Service
public class StrategyService {

    private final StrategyFactory strategyFactory;

    public StrategyService(StrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    public StrategyDTO create(String notificationType) {
        Notification notification = strategyFactory.getService(notificationType);
        return notification.execute();
    }
}
