package com.ahuaman.dogedex.domain

import com.squareup.moshi.Json

data class DogResponse (
    @field:Json(name = "is_success")val isSuccess:Boolean,
    val message: String,
    val data:DogLisResponse
)

data class DogLisResponse(
    val dogs:List<DogDTO>
)

fun DogLisResponse.toDomain():List<Dog>{
    return dogs.map {
        Dog(
            id = it.id,
            index = it.index,
            name = it.name,
            dogType = it.dogType,
            heightFemale = it.heightFemale,
            heightMale = it.heightMale,
            imageUrl = it.imageUrl,
            lifeExpectancy = it.lifeExpectancy,
            temperament = it.temperament,
            weightFemale = it.weightFemale,
            weightMale = it.weightMale
        )
    }
}