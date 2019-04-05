package com.lindley.healthboot;

import com.lindley.healthboot.model.common.HealthEndpoint;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EndpointService {

    // TODO properties?
    private String discoveryUrl = "http://localhost:8081/endpoints/all";

    public ArrayList<HealthEndpoint> getEndpoints() {
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

        return endpoints;
    }
}
