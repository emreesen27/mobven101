package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private var counterUseCase: CounterUseCase = CounterUseCase()
    private var counter = Counter(0)
    private val counterMutableLiveData: MutableLiveData<Int> = MutableLiveData()
    val counterLiveData: LiveData<Int> = counterMutableLiveData

    fun increment() {
        counterMutableLiveData.value = counterUseCase.execute(counter)
    }


}