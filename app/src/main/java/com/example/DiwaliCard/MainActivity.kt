package com.example.DiwaliCard
import android.media.MediaPlayer
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import com.example.birthdaygreet.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }

    fun createCard(view: View) {
//        val MediaPlayer wonder= MediaPlayer.create(this, R.raw.TWOY);
        val name = nameInput.editableText.toString()
        val intent = Intent(this, greeting::class.java)
        intent.putExtra(greeting.NAME_EXTRA,name)
        startActivity(intent)
/*
    val name = nameInput.editableText.toString()
    Toast.makeText(this,"Hello $name Beautiful", Toast.LENGTH_LONG ).show()
*/
    }
}