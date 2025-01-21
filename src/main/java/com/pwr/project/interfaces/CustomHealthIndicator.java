package com.pwr.project.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Health health() {
        boolean isServiceUp = checkServiceHealth(); // Własna logika sprawdzania stanu
        if (isServiceUp) {
            return Health.up().withDetail("Service", "Up and Running").build();
        } else {
            return Health.down().withDetail("Service", "Down").build();
        }
    }

    private boolean checkServiceHealth() {
        try {
            // Sprawdzenie, czy można wykonać proste zapytanie do bazy danych
            jdbcTemplate.queryForObject("SELECT 1", Integer.class);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}

