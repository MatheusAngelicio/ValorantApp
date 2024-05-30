package com.example.valorantapp.core.utils

sealed class ResultData<out T> {

    object Loading : ResultData<Nothing>()
    data class Success<out T>(val data: T) : ResultData<T>()
    data class Failure(val e: Exception) : ResultData<Nothing>()

    companion object {
        fun handleException(e: Throwable): Failure {
            return ExceptionHandler.handleException(e)
        }
    }
}