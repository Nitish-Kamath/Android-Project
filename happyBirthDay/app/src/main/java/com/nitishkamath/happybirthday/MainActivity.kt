package com.nitishkamath.happybirthday

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        btnNext.setOnClickListener {
            if (etName.text.toString().trim() { it <= ' ' }
                    .isNotEmpty() && etAge.text.toString().isNotEmpty()) {
                val name = etName.text.toString()
                val age = etAge.text.toString()


                val intent = Intent(this, FinalActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("age", age)

                startActivity(intent)

            } else {
                Toast.makeText(this, "Hey User!! Please Enter full credential", Toast.LENGTH_LONG)
                    .show()
            }


        }
    }
}