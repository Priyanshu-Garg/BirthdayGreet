package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createbirthdaycard(view: android.view.View) {
        val nameinput=findViewById<EditText>(R.id.nameinput)
        val name=nameinput.editableText.toString()
        Toast.makeText(this, "Name is $name", Toast.LENGTH_LONG).show()

        val intent = Intent(this,BirthdayGreeting::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}