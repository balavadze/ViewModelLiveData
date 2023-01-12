package com.example.viewmodellivedata.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var counter = MutableLiveData<Int> (0)

    fun increment(){
        val currentValue = counter.value
        if (currentValue != null) {
             counter.value = currentValue +1
        }
    }
}