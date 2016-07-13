package com.globus.demo.network;

import com.globus.demo.model.RouteResponse;

import retrofit2.Call;
import retrofit2.Callback;

public class NetworkProvider {

    private static NetworkProvider sNetworkProvider;

    private RouteApi mServiceApi;

    private NetworkProvider() {
        mServiceApi = NetworkUtils.provideRoutApi();
    }

    public static NetworkProvider getInstance() {
        if (sNetworkProvider == null) {
            sNetworkProvider = new NetworkProvider();
        }

        return sNetworkProvider;
    }

    public void getRouteResponse(String position, String destination, Callback<RouteResponse> callback) {
        Call<RouteResponse> call = mServiceApi.getRoute(position, destination, true, "ru");
        call.enqueue(callback);
    }
}
