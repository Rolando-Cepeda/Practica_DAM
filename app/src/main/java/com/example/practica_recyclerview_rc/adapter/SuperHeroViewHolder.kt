package com.example.practica_recyclerview_rc.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practica_recyclerview_rc.R
import com.example.practica_recyclerview_rc.SuperHero

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val superHero = view.findViewById<TextView>(R.id.tvSuperHeroName)
    val realName = view.findViewById<TextView>(R.id.tvRealName)
    val publisher = view.findViewById<TextView>(R.id.tvPublisher)
    val photo = view.findViewById<ImageView>(R.id.ivSuperHero)
    fun render(superHeroModel: SuperHero){
        superHero.text = superHeroModel.superHeroName
        realName.text = superHeroModel.realName
        publisher.text = superHeroModel.publisher
    }
}