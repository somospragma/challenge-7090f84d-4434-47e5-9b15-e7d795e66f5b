package com.pragma.reactivesystem.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.reactor.circuitbreaker.operator.CircuitBreakerOperator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResilienceConfig {

    @Bean
    public CircuitBreakerConfig circuitBreakerConfig() {
        return CircuitBreakerConfig.custom()
               .slidingWindowSize(10)
               .minimumNumberOfCalls(5)
               .failureRateThreshold(50)
               .waitDurationInOpenState(10000)
               .permittedNumberOfCallsInHalfOpenState(3)
               .build();
    }

    @Bean
    public CircuitBreakerOperator circuitBreakerOperator() {
        return CircuitBreakerOperator.of(circuitBreakerConfig());
    }
}