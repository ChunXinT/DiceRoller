package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
// import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRoll: Button = findViewById(R.id.roll_button)

        btnRoll.setOnClickListener (){
            rollDice()
        }

        val btnCount: Button = findViewById(R.id.countup_button)
        btnCount.setOnClickListener (){
            countUp()
        }
    }


    private fun rollDice() {
        val tvResult: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        tvResult.text = randomInt.toString()
        // Toast.makeText(this,"Button is click",Toast.LENGTH_LONG).show()
        // A toast is a view that shows the user a simple message in a small popup window.
    }

    private fun countUp() {
        val tvResult: TextView = findViewById(R.id.result_text)
            // increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = tvResult.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                tvResult.text = resultInt.toString()
            }
        }
    }

