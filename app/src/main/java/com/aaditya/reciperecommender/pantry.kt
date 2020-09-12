package com.aaditya.reciperecommender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class pantry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantry)

        val search_recipes = findViewById(R.id.search_recipes) as CardView

        search_recipes.setOnClickListener {
            val intent = Intent(this, recipe_list::class.java)
            startActivity(intent)

        }

        val see_list = findViewById(R.id.see_list) as CardView

        search_recipes.setOnClickListener {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)

        }
    }

}