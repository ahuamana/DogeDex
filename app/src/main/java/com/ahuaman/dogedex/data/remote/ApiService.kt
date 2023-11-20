package com.ahuaman.dogedex.data.remote

import com.ahuaman.dogedex.Constants
import com.ahuaman.dogedex.domain.Dog
import com.ahuaman.dogedex.domain.DogResponse
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET



private val retrofit = Retrofit.Builder()
    .baseUrl(Constants.BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create())
    .build()


interface ApiService {
    @GET("dogs")
    suspend fun getDogList(): DogResponse
}

object DogApi {
    val retrofitService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}