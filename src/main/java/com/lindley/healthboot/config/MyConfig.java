package com.lindley.healthboot.config;

import com.lindley.healthboot.model.common.HealthEndpoint;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "my")
public class MyConfig {

    private List<HealthEndpoint> endpoints;
    private String name;
    private String suffix;
    private List<String> attr;

    public List<HealthEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<HealthEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public List<String> getAttr() {
        return attr;
    }

    public void setAttr(List<String> attr) {
        this.attr = attr;
    }
}
