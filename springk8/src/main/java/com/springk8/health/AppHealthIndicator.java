package com.springk8.health;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class AppHealthIndicator implements HealthIndicator {

    @Override
    public @Nullable Health health() {
        return Health.up()
                .withDetail("application", "running")
                .build();
    }

}
