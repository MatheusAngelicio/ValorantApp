package com.example.valorantapp.data.network.interceptor

import com.example.valorantapp.core.utils.Constants
import okhttp3.Interceptor
import okhttp3.Response

class ParamsInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val url = request.url.newBuilder()
            // Adiciona um query params padrao
            .addQueryParameter(Constants.LANGUAGE_PARAM, Constants.LANGUAGE_VALUE)
            .build()

        val newRequest = request.newBuilder()
            .url(url)
            .build()

        return chain.proceed(newRequest)
    }
}