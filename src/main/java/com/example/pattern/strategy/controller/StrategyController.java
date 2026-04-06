package com.example.pattern.strategy.controller;

import com.example.pattern.strategy.dto.StrategyDTO;
import com.example.pattern.strategy.service.StrategyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {

    private final StrategyService strategyService;

    public StrategyController(StrategyService strategyService) {
        this.strategyService = strategyService;
    }

    @GetMapping("/strategy/{notificationType}")
    public ResponseEntity<StrategyDTO> getStrategy(@PathVariable("notificationType") String notificationType) {
        return ResponseEntity.ok(strategyService.create(notificationType));
    }
}
