package com.example.quizzer.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.quizzer.R

class learn : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.learn)
    val button = findViewById<ImageButton>(R.id.cou)
    button.setOnClickListener {

        val intent = Intent(this,learn::class.java)
        startActivity(intent)
    }
        val btn = findViewById<ImageButton>(R.id.game)
        btn.setOnClickListener {

            val intent1 = Intent(this,MainActivity::class.java)
            startActivity(intent1)
        }
        val bt = findViewById<ImageButton>(R.id.bio)
        bt.setOnClickListener {

            val inten = Intent(this,top::class.java)
            startActivity(inten)
        }
}
}
