package com.example.myapplication

data class Counter(var counter: Int) {
    operator fun inc() = Counter(counter + 1)
}
