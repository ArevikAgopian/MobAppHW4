package com.example.newhomework4.network

import com.example.newhomework4.model.WeatherInfo
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiService {
    @GET("current.json")
    suspend fun getWeatherInfo(@Query("q") city: String): WeatherInfo
}
