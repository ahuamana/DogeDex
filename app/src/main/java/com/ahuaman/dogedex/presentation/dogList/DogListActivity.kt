package com.ahuaman.dogedex.presentation.dogList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ahuaman.dogedex.R
import com.ahuaman.dogedex.databinding.ActivityDogListBinding
import com.ahuaman.dogedex.domain.FakeData

class DogListActivity : AppCompatActivity() {

    private val dogListViewModel : DogListViewModel by viewModels()

    val binding by lazy { ActivityDogListBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(binding.root)

        val recycler = binding.dogListRecyclerView

        val adapter = DogAdapter()
        recycler.adapter = adapter

        dogListViewModel.listOfDogs.observe(this){
            adapter.submitList(it)
        }
    }

}