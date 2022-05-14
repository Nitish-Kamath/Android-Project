package com.nitishkamath.daychecker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecylcerView()

        add.setOnClickListener {
            val intent = Intent(this, CreateCard::class.java)
            startActivity(intent)

            setRecylcerView()
        }

    }

    private fun setRecylcerView() {
        recycler_view.adapter = myAdapter(DataObject.getAllData())
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

}