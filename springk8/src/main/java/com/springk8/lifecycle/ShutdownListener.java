package com.springk8.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ShutdownListener {
    @PreDestroy
    public void onShutDown() {
        log.info("Kubernetes is stopping this pod.");
    }
}
