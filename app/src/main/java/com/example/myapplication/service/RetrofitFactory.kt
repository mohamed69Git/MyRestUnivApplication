package com.example.myapplication.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitFactory {
    private const val BASE_URL = "https://restuniv.herokuapp.com/api/"

    //        "https://restuniv.herokuapp.com/api/"
    fun makeRetrofitService(): RetrofitService {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(RetrofitService::class.java)

    }
}