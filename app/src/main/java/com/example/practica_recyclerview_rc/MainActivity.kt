package com.example.practica_recyclerview_rc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    val superheros: List<SuperHero> = listOf(

                SuperHero(
                    superHeroName = "Spider-Man",
                    realName = "Peter Parker",
                    publisher = "Marvel",
                    image = "https://example.com/spiderman.jpg"
                ),
                SuperHero(
                    superHeroName = "Batman",
                    realName = "Bruce Wayne",
                    publisher = "DC",
                    image = "https://example.com/batman.jpg"
                ),
                SuperHero(
                    superHeroName = "Wonder Woman",
                    realName = "Diana Prince",
                    publisher = "DC",
                    image = "https://example.com/wonderwoman.jpg"
                ),
                SuperHero(
                    superHeroName = "Iron Man",
                    realName = "Tony Stark",
                    publisher = "Marvel",
                    image = "https://example.com/ironman.jpg"
                ),
                SuperHero(
                    superHeroName = "Captain America",
                    realName = "Steve Rogers",
                    publisher = "Marvel",
                    image = "https://example.com/captainamerica.jpg"
                ),
                SuperHero(
                    superHeroName = "Thor",
                    realName = "Thor Odinson",
                    publisher = "Marvel",
                    image = "https://example.com/thor.jpg"
                ),
                SuperHero(
                    superHeroName = "Hulk",
                    realName = "Bruce Banner",
                    publisher = "Marvel",
                    image = "https://example.com/hulk.jpg"
                ),
                SuperHero(
                    superHeroName = "Black Widow",
                    realName = "Natasha Romanoff",
                    publisher = "Marvel",
                    image = "https://example.com/blackwidow.jpg"
                ),
                SuperHero(
                    superHeroName = "Flash",
                    realName = "Barry Allen",
                    publisher = "DC",
                    image = "https://example.com/flash.jpg"
                ),
                SuperHero(
                    superHeroName = "Green Lantern",
                    realName = "Hal Jordan",
                    publisher = "DC",
                    image = "https://example.com/greenlantern.jpg"
                ),
                SuperHero(
                    superHeroName = "Aquaman",
                    realName = "Arthur Curry",
                    publisher = "DC",
                    image = "https://example.com/aquaman.jpg"
                ),
                SuperHero(
                    superHeroName = "Doctor Strange",
                    realName = "Stephen Strange",
                    publisher = "Marvel",
                    image = "https://example.com/doctorstrange.jpg"
                )
            )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}