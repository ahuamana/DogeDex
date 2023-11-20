package com.ahuaman.dogedex.presentation.dogList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahuaman.dogedex.R
import com.ahuaman.dogedex.databinding.ActivityDogListBinding
import com.ahuaman.dogedex.domain.FakeData

class DogListActivity : AppCompatActivity() {

    val binding = ActivityDogListBinding.inflate(layoutInflater)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val dogList = FakeData.getFakeDogs()

        val recycler = binding.dogListRecyclerView
    }

}