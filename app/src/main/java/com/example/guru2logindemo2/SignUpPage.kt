package com.example.guru2logindemo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpPage : AppCompatActivity() {

    lateinit var btnSignUpSuccess : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_page)

        btnSignUpSuccess=findViewById<Button>(R.id.btnSignUpSuccess)
    }
}
