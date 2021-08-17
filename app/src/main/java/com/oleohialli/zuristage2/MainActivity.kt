package com.oleohialli.zuristage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var inputField: EditText
    private lateinit var textDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameText = findViewById<TextView>(R.id.nameText)
        nameText.text = "Oleohi Alli"

        inputField = findViewById(R.id.inputField)
        textDisplay = findViewById(R.id.displayText)


        inputField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) { }

            override fun afterTextChanged(p0: Editable?) {
                displayAnything()
            }
        })
    }

    private fun displayAnything() {
        textDisplay.text = inputField.text
    }
}