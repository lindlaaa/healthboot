package com.lindley.healthboot.controller;

import com.lindley.healthboot.model.common.response.HealthResponseAggregate;
import org.springframework.http.ResponseEntity;

public interface IHealthController {
    ResponseEntity<HealthResponseAggregate> getHealth();
}
