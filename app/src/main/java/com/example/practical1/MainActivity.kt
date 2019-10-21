package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //this is tell system the image will be uploaded later, now just let it empty
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    lateinit var diceImage3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { countDice() }

        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resetDice() }
    }

    private fun rollDice() {
        //  Toast.makeText(this, "button clicked",
        //     Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        //this is get textview id
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)


        //this is print out something to the textview
        // resultText.text = "0"
       resultText.text = randomInt.toString()
       resultText2.text = randomInt2.toString()
       resultText3.text = randomInt3.toString()

        diceImage1 = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)


        val drawableResource = when (randomInt) {

            //call the diagram
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //below this is call the if else
        diceImage1.setImageResource(drawableResource)

        val drawableResource2 = when (randomInt2) {

            //call the diagram
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //below this is call the if else
        diceImage2.setImageResource(drawableResource2)

        val drawableResource3 = when (randomInt3) {

            //call the diagram
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //below this is call the if else
        diceImage3.setImageResource(drawableResource3)


    }

    private fun countDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
                val diceImage1: ImageView = findViewById(R.id.dice_image)

                val drawableResource = when (resultInt) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                diceImage1.setImageResource(drawableResource)
            }
            }
            if (resultText2.text == "Hello World!") {
                resultText2.text = "1"
            } else {
                // Otherwise, increment the number up to 6.
                // The text value in resultText.text is an instance of the CharSequence class;
                // it needs to be converted to a String object before it can be converted to an int.
                var resultInt2 = resultText2.text.toString().toInt()

                if (resultInt2 < 6) {
                    resultInt2++
                    resultText2.text = resultInt2.toString()
                    val diceImage2: ImageView = findViewById(R.id.dice_image2)

                    val drawableResource2 = when (resultInt2) {
                        1 -> R.drawable.dice_1
                        2 -> R.drawable.dice_2
                        3 -> R.drawable.dice_3
                        4 -> R.drawable.dice_4
                        5 -> R.drawable.dice_5
                        else -> R.drawable.dice_6
                    }

                    diceImage2.setImageResource(drawableResource2)
                }

            }

        if (resultText3.text == "Hello World!") {
            resultText3.text = "1"
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
                val diceImage3: ImageView = findViewById(R.id.dice_image3)

                val drawableResource3 = when (resultInt3) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                diceImage3.setImageResource(drawableResource3)
            }

        }


    }
        private fun resetDice() {
            val resultText: TextView = findViewById(R.id.result_text)
            val resultText2: TextView = findViewById(R.id.result_text2)
            val resultText3: TextView = findViewById(R.id.result_text3)
            // If text is the default "Hello World!" set that text to 1.
            var resultInt = resultText.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()
            resultText.text = "0"
            resultText2.text = "0"
            resultText3.text = "0"

            diceImage1 = findViewById(R.id.dice_image)
            diceImage2 = findViewById(R.id.dice_image2)
            diceImage3 = findViewById(R.id.dice_image3)

            val drawableResource = when (resultInt) {

                else -> R.drawable.empty_dice
            }
            val drawableResource2 = when (resultInt2) {

                else -> R.drawable.empty_dice
            }
            val drawableResource3 = when (resultInt3) {

                else -> R.drawable.empty_dice
            }
            diceImage1.setImageResource(drawableResource)
            diceImage2.setImageResource(drawableResource2)
            diceImage3.setImageResource(drawableResource3)
        }


    }

