package com.example.quizzer.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.quizzer.R

class top: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.topic)
        var back=findViewById<ImageButton>(R.id.be)
        back.setOnClickListener{
            val intent2= Intent(this,learn::class.java)
            startActivity(intent2)
        }
        var bac=findViewById<Button>(R.id.lw)
        bac.setOnClickListener{
            val intent3= Intent(this,read::class.java)
            startActivity(intent3)
        }
        var ak=findViewById<Button>(R.id.ak)
        ak.setOnClickListener{
            val aki= Intent(this,animal::class.java)
            startActivity(aki)
        }
    }
}