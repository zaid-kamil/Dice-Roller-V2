package com.podium.dicerollerv2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // The lateinit keyword promises the Kotlin compiler that
    // the variable will be initialized before the code calls any operations on it.
    // Therefore we don't need to initialize the variable to null
    private lateinit var imgDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgDice = findViewById(R.id.image_dice)
        val btn: Button = findViewById(R.id.btnRoll)
        btn.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val imgRes = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDice.setImageResource(imgRes)
    }
    // todo TASK. add one more dice to the screen

}