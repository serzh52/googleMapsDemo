package com.globus.demo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class StartLocation_ {

@JsonProperty("lat")
private Double lat;
@JsonProperty("lng")
private Double lng;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public StartLocation_() {
    }

    /**
* 
* @return
* The lat
*/
@JsonProperty("lat")
public Double getLat() {
return lat;
}

/**
* 
* @param lat
* The lat
*/
@JsonProperty("lat")
public void setLat(Double lat) {
this.lat = lat;
}

/**
* 
* @return
* The lng
*/
@JsonProperty("lng")
public Double getLng() {
return lng;
}

/**
* 
* @param lng
* The lng
*/
@JsonProperty("lng")
public void setLng(Double lng) {
this.lng = lng;
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