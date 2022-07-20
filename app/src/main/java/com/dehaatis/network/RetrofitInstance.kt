package com.dehaatis.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance  {
    val baseUrl = "https://www.dehaatis.com/"
    private fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    val apiInterface = getInstance().create(ApiInterface::class.java)
}