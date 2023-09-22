package com.example.a2209

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.przycisk1).setOnClickListener{
            //findViewById<Button>(R.id.przycisk1).text =
                findViewById<ImageView>(R.id.mojobraz1).setImageResource(
                    R.drawable.pies
                )
        }
    }
}

