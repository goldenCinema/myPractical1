package com.example.mypractical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val addButton: Button = findViewById(R.id.add_button)
        addButton.setOnClickListener { countUp() }
    }
    private fun rollDice(){
        val randomInt = Random().nextInt(6)+1
        val randomInt1 = Random().nextInt(6)+1
        val randomInt2 = Random().nextInt(6)+1
        /*Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()*/
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = randomInt.toString()
        resultText1.text = randomInt1.toString()
        resultText2.text = randomInt2.toString()

    }

    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if(resultText.text == "Hello World!"&&resultText1.text == ""&&resultText2.text==""){
            resultText.text = "1"
            resultText1.text = "2"
            resultText2.text = "3"
        }
        var resultInt = resultText.text.toString().toInt()
        var resultInt1 = resultText1.text.toString().toInt()
        var resultInt2 = resultText2.text.toString().toInt()

        var totalInt = resultInt+resultInt1+resultInt2
        val totalText: TextView = findViewById(R.id.total_text)
        totalText.text = totalInt.toString()
    }
}
