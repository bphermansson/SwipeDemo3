package com.example.swipedemo3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout


class MainActivity : AppCompatActivity() {
    private lateinit var layout: RelativeLayout
    private lateinit var clayout: ConstraintLayout

    var number: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clayout = findViewById(R.id.mainlayout)
        clayout.setOnTouchListener(object : OnSwipeTouchListener(this@MainActivity) {
            override fun onSwipeLeft() {
                super.onSwipeLeft()
                Toast.makeText(this@MainActivity, "Swipe Left gesture detected",
                    Toast.LENGTH_SHORT)
                    .show()
            }
            override fun onSwipeRight() {
                super.onSwipeRight()
                Toast.makeText(
                    this@MainActivity,
                    "Swipe Right gesture detected",
                    Toast.LENGTH_SHORT
                ).show()
            }
            override fun onSwipeUp() {
                super.onSwipeUp()
                Toast.makeText(this@MainActivity, "Swipe up gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }
            override fun onSwipeDown() {
                super.onSwipeDown()
                Toast.makeText(this@MainActivity, "Swipe down gesture detected", Toast.LENGTH_SHORT)
                    .show()
            }
        })

    }
}