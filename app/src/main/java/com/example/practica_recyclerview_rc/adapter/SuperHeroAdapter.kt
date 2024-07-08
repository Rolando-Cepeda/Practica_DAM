package com.example.practica_recyclerview_rc.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica_recyclerview_rc.R
import com.example.practica_recyclerview_rc.SuperHero


class SuperHeroAdapter(private val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superheroList.size
    // override fun getItemCount(): Int {
    //        return superheroList.size
    //    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superheroList[position]
        holder.render(item)
    }


}