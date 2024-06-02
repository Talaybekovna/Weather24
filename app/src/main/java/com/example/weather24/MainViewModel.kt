package com.example.weather24

import androidx.lifecycle.MutableLiveData

class MainViewModel {
    val liveDataCurrent = MutableLiveData<String>()
    val liveDataList = MutableLiveData<List<String>>()
}