package com.example.DiwaliCard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birthdaygreet.R
import kotlinx.android.synthetic.main.activity_greeting.*

class greeting : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        val name = intent.getStringExtra(NAME_EXTRA)
        messagehead.text= "Happy Diwali $name"


    }
}