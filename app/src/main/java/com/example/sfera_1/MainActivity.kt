package com.example.sfera_1

import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var profilename: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewBinding()
        //val type = Typeface.createFromAsset(assets, "res/font/inter.ttf")
        //textView.setTypeface(type)
        //textView.gravity = Gravity.CENTER_VERTICAL or Gravity.CENTER_HORIZONTAL
    }

    fun viewBinding() {
        textView = findViewById(R.id.some_id)
    }

}