package com.example.weatherforecast

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewClass : ViewModel() {
    val liveDataCurrent = MutableLiveData<String>()
    val liveDataList = MutableLiveData<List<String>>()
}