package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_btn)
        rollButton.setOnClickListener {
            rolldiced()
        }
    }

    private fun rolldiced() {

        val randomInt = java.util.Random().nextInt(6) + 1
        val diceResource = when(randomInt){
            1 ->R.drawable.dice_1
            2 ->R.drawable.dice_2
            3 ->R.drawable.dice_3
            4 ->R.drawable.dice_4
            5 ->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        val dinamicImage:ImageView = findViewById(R.id.dice_image)
        dinamicImage.setImageResource(diceResource)
    }
}