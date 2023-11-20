package com.ahuaman.dogedex.data

import com.ahuaman.dogedex.domain.Dog
import com.ahuaman.dogedex.domain.FakeData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class DogRepository {

    suspend fun getDogList():List<Dog>{
       return withContext(Dispatchers.IO){
            FakeData.getFakeDogs()
        }
    }
}