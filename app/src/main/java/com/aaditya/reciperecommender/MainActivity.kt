package com.aaditya.reciperecommender

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_click_me = findViewById(R.id.btn_click_me) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            // your code to perform when the user clicks on the button
            startActivity(Intent(this@MainActivity, recipe_display::class.java))
        }
    }



}