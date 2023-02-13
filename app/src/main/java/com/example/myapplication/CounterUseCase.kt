package com.example.myapplication

class CounterUseCase : UseCase<Counter, Int>() {
    override fun execute(params: Counter): Int = params.counter++
}