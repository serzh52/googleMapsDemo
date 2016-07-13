package com.globus.demo.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class Duration {

@JsonProperty("text")
private String text;
@JsonProperty("value")
private Integer value;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Duration() {
    }

    /**
* 
* @return
* The text
*/
@JsonProperty("text")
public String getText() {
return text;
}

/**
* 
* @param text
* The text
*/
@JsonProperty("text")
public void setText(String text) {
this.text = text;
}

/**
* 
* @return
* The value
*/
@JsonProperty("value")
public Integer getValue() {
return value;
}

/**
* 
* @param value
* The value
*/
@JsonProperty("value")
public void setValue(Integer value) {
this.value = value;
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