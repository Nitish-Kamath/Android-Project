package com.nitishkamath.mytodoapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_create_card.*


class CreateCard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_card)

        save_button.setOnClickListener {
            if (create_title.text.toString().trim { it <= ' ' }.isNotEmpty()
                && create_priority.text.toString().trim { it <= ' ' }.isNotEmpty()
            ) {
                var title = create_title.getText().toString()
                var priority = create_priority.getText().toString()
                DataObject.setData(title, priority)


                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}

