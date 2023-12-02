package com.example.newhomework4.viewModel


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.newhomework4.model.WeatherInfo
import com.example.newhomework4.network.RetrofitClient
import kotlinx.coroutines.launch

class WeatherApiViewModel(private val city: String) : ViewModel() {
    private val weatherApiService = RetrofitClient.weatherApiService

    private val _weatherInfo = MutableLiveData<WeatherInfo>()
    val weatherInfo: LiveData<WeatherInfo> get() = _weatherInfo

    init {
        viewModelScope.launch {
            try {
                val response = weatherApiService.getWeatherInfo(city)

                _weatherInfo.value = response
            } catch (e: Exception) {
                Log.e("Retrofit", "Error fetching user data", e)
            }
        }
    }
}

class WeatherApiViewModelFactory(private val city: String) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WeatherApiViewModel::class.java)) {
            return WeatherApiViewModel(city) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}