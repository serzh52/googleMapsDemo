package com.globus.demo.network;

import com.globus.demo.model.RouteResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RouteApi {

    @GET("/maps/api/directions/json")
    Call<RouteResponse> getRoute(@Query(value = "origin") String position,
                                 @Query(value = "destination") String destination,
                                 @Query("sensor") boolean sensor,
                                 @Query("language") String language );

}

