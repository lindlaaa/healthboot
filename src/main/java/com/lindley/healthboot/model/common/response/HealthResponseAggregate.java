package com.lindley.healthboot.model.common.response;

import com.lindley.healthboot.model.common.HealthEndpoint;
import org.springframework.util.Assert;

import java.util.ArrayList;

public class HealthResponseAggregate {

    private ArrayList<HealthResponse> responses = new ArrayList<>();

    public HealthResponseAggregate() {
    }

    public HealthResponseAggregate addResponse(HealthEndpoint endpoint, EndpointResponse response) {
        Assert.notNull(endpoint, "Endpoint object must not be null.");
        Assert.notNull(response, "Response object must not be null.");
        HealthResponse newResponse = new HealthResponse(endpoint, response);
        responses.add(newResponse);
        return this;
    }

    public ArrayList<HealthResponse> getResponses() {
        return responses;
    }

    public void setResponses(ArrayList<HealthResponse> responses) {
        this.responses = responses;
    }
}
