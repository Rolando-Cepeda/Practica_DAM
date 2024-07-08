package com.example.practica_recyclerview_rc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class HeroAdapter (val superhero:List<SuperHero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun getItemCount(): Int = superhero.size
    // override fun getItemCount(): Int {
        //        return superhero.size
        //    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
       holder.render(superhero[position])
    }

    class HeroHolder(val view: View):RecyclerView.ViewHolder(view) {

        val tvRealName: TextView = view.findViewById(R.id.tvRealName)
        val tvSuperHeroName: TextView = view.findViewById(R.id.tvSuperHeroName)
        val tvPublisher: TextView = view.findViewById(R.id.tvPublisher)
        fun render(superhero: SuperHero) {
            tvRealName.text = superhero.realName
            tvSuperHeroName.text = superhero.superHeroName
            tvPublisher.text = superhero.publisher
        }
    }
}