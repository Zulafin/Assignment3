package com.example.assignment3;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("9c7947df-001f-4cea-8f7b-369c44011946")
    Call<CovidResponse> getDataCovid();
}
