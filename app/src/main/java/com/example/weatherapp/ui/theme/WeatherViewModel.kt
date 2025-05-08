package com.example.weatherapp.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import api.Constant
import api.RetrofitInstance
import kotlinx.coroutines.launch
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import api.NetworkResponse
import api.WeatherModel

class WeatherViewModel : ViewModel() {
    private val weatherApi = RetrofitInstance.weatherApi
    private val _weatherData = MutableLiveData<NetworkResponse<WeatherModel>>()
    val weatherLiveData: LiveData<NetworkResponse<WeatherModel>> = _weatherData

    private val weatherData: LiveData<NetworkResponse<WeatherModel>> = _weatherData
    fun getData(city: String) {
        _weatherData.value = NetworkResponse.Loading
        viewModelScope.launch {
            try {

                val response = weatherApi.getWeather(Constant.apiKey, city)
                if (response.isSuccessful) {
                    response.body()?.let {

                        _weatherData.value = NetworkResponse.Success(it)
                    }
                } else {
                    _weatherData.value = NetworkResponse.Error("Failed to fetch weather data")
                }
            } catch (e: Exception) {
                _weatherData.value = NetworkResponse.Error("Failed to fetch weather data")
            }
        }
    }
}

