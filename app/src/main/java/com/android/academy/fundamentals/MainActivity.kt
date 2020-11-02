package com.android.academy.fundamentals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.academy.fundamentals.SecondActivity.Companion.TRANSMITTED_BOOLEAN
import com.android.academy.fundamentals.SecondActivity.Companion.TRANSMITTED_INT
import com.android.academy.fundamentals.SecondActivity.Companion.TRANSMITTED_STRING

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.first_activity_text_view)
        textView.setOnClickListener { moveToNextScreen() }
    }

    private fun moveToNextScreen() {
        val intent = Intent(this, SecondActivity::class.java)

        val transmittedString = "string to transmit"
        intent.putExtra(TRANSMITTED_STRING, transmittedString)

        val transmittedInt = 12
        intent.putExtra(TRANSMITTED_INT, transmittedInt)

        val transmittedBoolean = false
        intent.putExtra(TRANSMITTED_BOOLEAN, transmittedBoolean)

        startActivity(intent)
    }
}
