package com.globus.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class RouteResponse {
    @JsonProperty("routes")
    private List<Route> routes = new ArrayList<>();
    @JsonProperty("status")
    private String status;

    public RouteResponse() {
    }

    public  String getPoints(){
        if(routes != null && routes.size() > 0) {
            return routes.get(0).getOverviewPolyline().getPoints();
        }
        return "";
    }

    /**
     *
     * @return
     * The routes
     */
    @JsonProperty("routes")
    public List<Route> getRoutes() {
        return routes;
    }

    /**
     *
     * @param routes
     * The routes
     */
    @JsonProperty("routes")
    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    /**
     *
     * @return
     * The status
     */
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    /**
     *
     * @param status
     * The status
     */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}