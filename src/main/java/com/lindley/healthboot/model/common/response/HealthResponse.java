package com.lindley.healthboot.model.common.response;

import com.lindley.healthboot.model.common.HealthEndpoint;

public class HealthResponse {
    private HealthEndpoint endpoint;
    private EndpointResponse response;

    public HealthResponse() {
    }

    public HealthResponse(HealthEndpoint endpoint, EndpointResponse response) {
        this.endpoint = endpoint;
        this.response = response;
    }

    public HealthEndpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(HealthEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    public EndpointResponse getResponse() {
        return response;
    }

    public void setResponse(EndpointResponse response) {
        this.response = response;
    }
}
