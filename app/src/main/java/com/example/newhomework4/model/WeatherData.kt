package com.example.newhomework4.model

data class WeatherInfo(
    val current: CurrentWeather,
)

data class CurrentWeather(
    val temp_c: Double,
    val humidity: Int
)

enum class TemperatureUnit {
    CELSIUS, FAHRENHEIT
}