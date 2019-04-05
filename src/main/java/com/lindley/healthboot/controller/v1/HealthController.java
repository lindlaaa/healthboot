package com.lindley.healthboot.controller.v1;

import com.lindley.healthboot.controller.IHealthController;
import com.lindley.healthboot.model.common.HealthEndpoint;
import com.lindley.healthboot.model.common.response.EndpointResponse;
import com.lindley.healthboot.model.common.response.HealthResponseAggregate;
import com.lindley.healthboot.service.EndpointRetrievalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

@RestController
public class HealthController implements IHealthController {

    @Autowired
    EndpointRetrievalService endopintService;

    @Override
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity<HealthResponseAggregate> getHealth() {
        // TODO refactor into services and components
        /* TODO
        get endpoints
        call endpoints
        analyze results
        return results and analysis results
         */

        ArrayList<HealthEndpoint> endpoints = endopintService.getEndpoints();

        RestTemplate restTemplate = new RestTemplate();
        HealthResponseAggregate aggregate = new HealthResponseAggregate();
        for (HealthEndpoint endpoint : endpoints) {
            EndpointResponse response;
            try {
                response = restTemplate.getForObject(endpoint.getUrl(), EndpointResponse.class);
            } catch (Exception ce) {
                response = new EndpointResponse().withStatus("UNKNOWN").withAdditionalProperty("Message", ce.getLocalizedMessage());
            }

            aggregate.addResponse(endpoint, response);
        }

        return new ResponseEntity<>(aggregate, HttpStatus.OK);
    }
}
