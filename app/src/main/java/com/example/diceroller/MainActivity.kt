package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceimage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton:Button=findViewById(R.id.roll_button)
        //val dice_image:ImageView=findViewById(R.id.dice_image)
        rollbutton.setOnClickListener {
            rollDice()
        }
        diceimage=findViewById(R.id.dice_image)
    }

    private fun rollDice() {
        val drawableResource = when (Random.nextInt(6)+1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
       // val dice_image:ImageView=findViewById(R.id.dice_image)
        diceimage.setImageResource(drawableResource)   //dice_image field instead of a local variable
    }
}