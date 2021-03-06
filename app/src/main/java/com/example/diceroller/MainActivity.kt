package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import android.widget.TextView
import android.widget.ImageView
// import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

        val btnRoll: Button = findViewById(R.id.roll_button)

        btnRoll.setOnClickListener (){
            rollDice()
        }

        // 1.2 coding challenge
//        val btnCount: Button = findViewById(R.id.countup_button)
//        btnCount.setOnClickListener (){
//            countUp()
//        }
    }


    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        // Toast.makeText(this,"Button is click",Toast.LENGTH_LONG).show()
        // A toast is a view that shows the user a simple message in a small popup window.
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    // 1.2 coding challenge
//    private fun countUp() {
////        val tvResult: TextView = findViewById(R.id.result_text)
////            // increment the number up to 6.
////            // The text value in resultText.text is an instance of the CharSequence class;
////            // it needs to be converted to a String object before it can be converted to an int.
////            var resultInt = tvResult.text.toString().toInt()
////
////            if (resultInt < 6) {
////                resultInt++
////                tvResult.text = resultInt.toString()
////            }
//        }
    }

