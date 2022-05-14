package com.nitishkamath.daychecker

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_card.*

class CreateCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_card)


        btnSave.setOnClickListener {
            if (etDay.text.toString().trim { it <= ' ' }.isNotEmpty() && etStatus.text.toString()
                    .trim { it <= ' ' }.isNotEmpty()
            ) {
                val day = etDay.text.toString()
                val status = etStatus.text.toString()

                DataObject.setData(day, status)

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)


            } else {
                Toast.makeText(
                    this,
                    "Hey User!! Please Enter the Complete Credential",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}