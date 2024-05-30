package com.example.valorantapp.core.utils

import retrofit2.HttpException
import java.io.IOException

object ExceptionHandler {
    fun handleException(e: Throwable): ResultData.Failure {
        return when (e) {
            is HttpException -> ResultData.Failure(e)
            is IOException -> ResultData.Failure(e)
            else -> ResultData.Failure(Exception("Unknown Error"))
        }
    }
}