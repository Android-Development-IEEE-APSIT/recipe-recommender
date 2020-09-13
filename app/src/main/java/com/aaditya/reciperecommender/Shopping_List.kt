package com.aaditya.reciperecommender

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_shopping__list.*


class Shopping_List : AppCompatActivity() {


    private var mAdapter: ArrayAdapter<String>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping__list)

        val Item_name = findViewById(R.id.add_item) as EditText
        val list_view = findViewById(R.id.list) as ListView
        val add = findViewById(R.id.add) as CardView


        mAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1)
        list_view.setAdapter(mAdapter)


        add.setOnClickListener {

                val item: String = Item_name.getText().toString()
                mAdapter!!.add(item)
                mAdapter!!.notifyDataSetChanged()
                Item_name.setText("")

        }



    }
}