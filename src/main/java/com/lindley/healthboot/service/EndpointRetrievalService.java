package com.lindley.healthboot.service;

import com.lindley.healthboot.config.MyConfig;
import com.lindley.healthboot.model.common.HealthEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EndpointRetrievalService {

    @Autowired
    private MyConfig properties;

    public List<HealthEndpoint> getEndpoints() {
        // TODO provide these endpoints through a service
        ArrayList<HealthEndpoint> endpoints = new ArrayList<>();
        endpoints.add(
                new HealthEndpoint(
                        "http://localhost:9091/actuator/health",
                        "healthService"
                ));
        endpoints.add(
                new HealthEndpoint(
                        "http://localhost:9092/actuator/health",
                        "healthService"
                ));
        endpoints.add(
                new HealthEndpoint(
                        "http://localhost:8081/actuator/health",
                        "AddressBook"
                ));

        return properties.getEndpoints();
    }
}
