package com.ahuaman.dogedex.presentation.dogList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ahuaman.dogedex.data.DogRepository
import com.ahuaman.dogedex.domain.Dog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DogListViewModel : ViewModel() {

    private val dogRepository = DogRepository()

    private val _listOfDogs:MutableLiveData<List<Dog>> = MutableLiveData()

    val listOfDogs: LiveData<List<Dog>>
        get() = _listOfDogs

    init {
        downloadLoadDogList()
    }

    private fun downloadLoadDogList() {
        viewModelScope.launch() {
            val dogs = dogRepository.getDogList()
            _listOfDogs.value = dogs
        }
    }
}