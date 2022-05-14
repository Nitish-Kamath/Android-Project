package com.nitishkamath.happybirthday

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_final.*

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        supportActionBar?.hide()
//        window.statusBarColor = Color.parseColor("#1383C3")


        BtnFinal.setOnClickListener {
            var intent = Intent(this, ExtraActivity::class.java)
            startActivity(intent)

        }
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")

        wish(name!!, age!!)


    }

    private fun wish(name: String, age: String) {
        val mydata =
            "Wishing My Dear Friend $name.\n" +
                    "        A very Happy Birthday and Hope that the year $age would be\n" +
                    "        very Prosperous for him :)"



        tvData.setText(mydata)

    }
}