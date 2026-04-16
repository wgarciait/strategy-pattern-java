package com.example.pattern.strategy.factory;

import com.example.pattern.strategy.notification.Notification;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class StrategyFactory {

    private Map<String, Notification> services = new HashMap<>();

    public StrategyFactory(List<Notification> notifications) {
        for (Notification ntf : notifications) {
            services.put(ntf.getType(), ntf);
        }
    }

    public Notification getService(String notificationType) {
        return services.get(notificationType);
    }
}
