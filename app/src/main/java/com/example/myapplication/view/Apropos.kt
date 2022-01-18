package com.example.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_guide.*

class Apropos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
//        setSupportActionBar(main_toolbar)
        // showing the back button in action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        main_toolbar.title = ""

        backbutton.setOnClickListener {
            onBackPressed()
        }
    }
}

//fun main(){
//    var a = mutableListOf(2,2)
//    a.add(0,5)
//    for(i in a)
//        println(i)
//
//}