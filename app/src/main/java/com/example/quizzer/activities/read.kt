package com.example.quizzer.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.quizzer.R

class read : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.read)
        var back3=findViewById<ImageButton>(R.id.bk)
        back3.setOnClickListener{
            val intent4= Intent(this,top::class.java)
            startActivity(intent4)
        }
        val textView = findViewById(R.id.TextView) as TextView
        val aSwitch = findViewById(R.id.switch1) as Switch
        val button = findViewById(R.id.button) as ImageButton

        button.setOnClickListener { tts(this@read, textView.text.toString(),aSwitch.isChecked) }
        var back=findViewById<Button>(R.id.nxt)
        back.setOnClickListener{
            val intent= Intent(this,animal::class.java)
            startActivity(intent)
        }
    }




}