package com.example.practica_recyclerview_rc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practica_recyclerview_rc.adapter.SuperHeroAdapter
import com.example.practica_recyclerview_rc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        //val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperH)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperH.layoutManager = LinearLayoutManager(this)
        //recyclerView.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList)
        binding.recyclerSuperH.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList)
    }
}