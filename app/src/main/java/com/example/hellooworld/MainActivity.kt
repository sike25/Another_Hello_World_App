package com.example.hellooworld
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            Toast.makeText(this, "Hello To You Too!", Toast.LENGTH_SHORT).show()

            Log.v("This is the tag", "Button Clicked!")
            //Searching the logcat on verbose for the message "Button Clicked!" is debugging.
            //If the log is too noisy, search the tag "This is the tag"
        }
    }
}