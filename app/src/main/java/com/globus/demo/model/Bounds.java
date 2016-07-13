package com.globus.demo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"northeast",
"southwest"
})
public class Bounds {

@JsonProperty("northeast")
private Northeast northeast;
@JsonProperty("southwest")
private Southwest southwest;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Bounds() {
    }

    /**
* 
* @return
* The northeast
*/
@JsonProperty("northeast")
public Northeast getNortheast() {
return northeast;
}

/**
* 
* @param northeast
* The northeast
*/
@JsonProperty("northeast")
public void setNortheast(Northeast northeast) {
this.northeast = northeast;
}

/**
* 
* @return
* The southwest
*/
@JsonProperty("southwest")
public Southwest getSouthwest() {
return southwest;
}

/**
* 
* @param southwest
* The southwest
*/
@JsonProperty("southwest")
public void setSouthwest(Southwest southwest) {
this.southwest = southwest;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}