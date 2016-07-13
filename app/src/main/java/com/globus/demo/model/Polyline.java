package com.globus.demo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Polyline {

@JsonProperty("points")
private String points;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Polyline() {
    }

    /**
* 
* @return
* The points
*/
@JsonProperty("points")
public String getPoints() {
return points;
}

/**
* 
* @param points
* The points
*/
@JsonProperty("points")
public void setPoints(String points) {
this.points = points;
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