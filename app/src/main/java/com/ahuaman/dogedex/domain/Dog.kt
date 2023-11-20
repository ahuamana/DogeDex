package com.ahuaman.dogedex.domain

import com.squareup.moshi.Json

data class DogDTO (
    val id: Int,
    val index : Int,
    @field:Json(name = "name_es")
    val name: String,
    @field:Json(name = "dog_type") val dogType: String,
    //heightFemale
    @field:Json(name= "height_female") val heightFemale : Double,
    //heightMale
    @field:Json(name= "height_male") val heightMale : Double,
    //imageUrl
    @field:Json(name= "image_url") val imageUrl : String,
    //lifeExpectancy
    @field:Json(name= "life_expectancy")
    val lifeExpectancy : String,
    //origin
    val temperament : String,
    //weightFemale
    @field:Json(name = "weight_female")
    val weightFemale : String,
    //weightMale
    @field:Json(name = "weight_male")
    val weightMale : String
)

data class Dog(
    val id: Int,
    val index : Int,
    val name: String,
    val dogType: String,
    //heightFemale
    val heightFemale : Double,
    //heightMale
    val heightMale : Double,
    //imageUrl
    val imageUrl : String,
    //lifeExpectancy
    val lifeExpectancy : String,
    //origin
    val temperament : String,
    //weightFemale
    val weightFemale : String,
    //weightMale
    val weightMale : String
)