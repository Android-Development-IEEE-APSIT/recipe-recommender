package com.aaditya.reciperecommender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.navigation.NavigationView

class favourite_recipes : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourite_recipes)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.b1_pantry -> startActivity(Intent(this,pantry::class.java))
            R.id.b2_basket -> startActivity(Intent(this,Basket::class.java))
            R.id.b3_list -> startActivity(Intent(this,Shopping_List::class.java))
            R.id.b4_favourite -> startActivity(Intent(this,favourite_recipes::class.java))
            R.id.b5_settings -> startActivity(Intent(this,MainActivity::class.java))
//            R.id.b6_logout ->
        }
//        drawer.closeDrawer(GravityCompat.START)
        return true


    }
}