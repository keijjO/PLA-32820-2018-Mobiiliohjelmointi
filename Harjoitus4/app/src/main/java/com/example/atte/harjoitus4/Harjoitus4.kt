package com.example.atte.harjoitus4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.widget.EditText
import android.widget.TextView

const val EXTRA_MESSAGE = "com.example.atte.harjoitus4"

class Harjoitus4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harjoitus4)
    }

//    /** Called when the user taps the Send button */
//    fun sendMessage(view: View) {
//        val editText = findViewById<EditText>(R.id.editText)
//        val message = editText.text.toString()
//        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
//            putExtra(EXTRA_MESSAGE, message)
//        }
//        startActivity(intent)
//    }

    fun refresh(view: View) {
        findViewById<EditText>(R.id.editText3).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText4).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText6).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText7).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText8).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText9).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText10).apply{text=SpannableStringBuilder("")}
        findViewById<EditText>(R.id.editText11).apply{text=SpannableStringBuilder("")}
        findViewById<TextView>(R.id.textView3).apply{text=SpannableStringBuilder("0")}
        findViewById<TextView>(R.id.textView4).apply{text=SpannableStringBuilder("0")}
        findViewById<TextView>(R.id.textView5).apply{text=SpannableStringBuilder("0")}
        findViewById<TextView>(R.id.textView9).apply{text=SpannableStringBuilder("0")}
    }

    fun calcSum(view: View) {
        val sum1 = findViewById<EditText>(R.id.editText3)
        val sum2 = findViewById<EditText>(R.id.editText4)
        if (sum1.text.toString() != "" && sum2.text.toString() != "") {
            val summa = sum1.text.toString().toInt() + sum2.text.toString().toInt()
            val sum3 = findViewById<TextView>(R.id.textView9).apply {
                text = SpannableStringBuilder(summa.toString())
            }
        }
    }

    fun calcSubtract(view: View) {
        val sum1 = findViewById<EditText>(R.id.editText6)
        val sum2 = findViewById<EditText>(R.id.editText9)
        if (sum1.text.toString() != "" && sum2.text.toString() != "") {
            val summa = sum1.text.toString().toInt() - sum2.text.toString().toInt()
            val sum3 = findViewById<TextView>(R.id.textView3).apply {
                text = SpannableStringBuilder(summa.toString())
            }
        }
    }

    fun calcMultiply(view: View) {
        val sum1 = findViewById<EditText>(R.id.editText7)
        val sum2 = findViewById<EditText>(R.id.editText10)
        if (sum1.text.toString() != "" && sum2.text.toString() != "") {
            val summa = sum1.text.toString().toInt() * sum2.text.toString().toInt()
            val sum3 = findViewById<TextView>(R.id.textView4).apply {
                text = SpannableStringBuilder(summa.toString())
            }
        }
    }

    fun calcDivide(view: View) {
        val sum1 = findViewById<EditText>(R.id.editText8)
        val sum2 = findViewById<EditText>(R.id.editText11)
        if (sum1.text.toString() != "" && sum2.text.toString() != "") {
            val summa = sum1.text.toString().toFloat() / sum2.text.toString().toFloat()
            val sum3 = findViewById<TextView>(R.id.textView5).apply {
                text = SpannableStringBuilder(summa.toString())
            }
        }
    }
}
