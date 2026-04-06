package com.example.pattern.strategy.notification;

import com.example.pattern.strategy.dto.StrategyDTO;

public interface Notification {
    StrategyDTO execute();
    String getType();
}
