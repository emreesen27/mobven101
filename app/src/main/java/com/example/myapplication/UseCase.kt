package com.example.myapplication

abstract class UseCase<Params, ReturnType> {
    abstract fun execute(params: Params): ReturnType
}