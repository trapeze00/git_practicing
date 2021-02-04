package com.example.guru2logindemo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var SignUp : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SignUp=findViewById<Button>(R.id.SignUp)

        SignUp.setOnClickListener {
            var intent = Intent(this, SignUpPage::class.java)
            startActivity(intent)
        }

    }
}