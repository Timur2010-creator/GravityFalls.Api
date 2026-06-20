package com.example.gravityfallsapi.data.network

import GravityFallsApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://gravity-falls-api.vercel.app/api/" //Подключение API ссылки

    //Постройка (на разных API постройка может быть разной особенно на 17 строке)
    val api: GravityFallsApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(GravityFallsApiService::class.java)
    }
}