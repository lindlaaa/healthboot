package com.lindley.healthboot.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "url",
        "serviceName"
})
public class HealthEndpoint {

    @JsonProperty("url")
    private String url;
    @JsonProperty("serviceName")
    private String serviceName;

    /**
     * No args constructor for use in serialization
     *
     */
    public HealthEndpoint() {
    }

    /**
     *
     * @param url
     * @param serviceName
     */
    public HealthEndpoint(String url, String serviceName) {
        super();
        this.url = url;
        this.serviceName = serviceName;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public HealthEndpoint withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("serviceName")
    public String getServiceName() {
        return serviceName;
    }

    @JsonProperty("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public HealthEndpoint withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

}