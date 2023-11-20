package com.ahuaman.dogedex.data

import com.ahuaman.dogedex.data.remote.DogApi
import com.ahuaman.dogedex.domain.Dog
import com.ahuaman.dogedex.domain.FakeData
import com.ahuaman.dogedex.domain.toDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DogRepository {

    suspend fun getDogList():List<Dog>{
       return withContext(Dispatchers.IO){
            val response = DogApi.retrofitService.getDogList()
            response.data.toDomain()
        }
    }
}