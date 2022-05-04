package com.app.figure.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class retroInstance {

    companion object {
        val Base_URL = "http://192.168.0.100:80/php/api/"


        fun getRetroInstance(): Retrofit {
            val retrofit = Retrofit.Builder()
                .baseUrl(Base_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit;

        }
    }

}