package com.springk8.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Getter
public class AppConfig {
    @Value("${APP_NAME:default-k8s-app}")
    private String appName;

    @Value("${SPRING_PROFILES_ACTIVE:default}")
    private String activeProfiles;
}
