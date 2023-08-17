package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text),
                findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text),
                findViewById(R.id.box_five_text),
                findViewById(R.id.box_six_text),
                findViewById(R.id.box_seven_text),
                findViewById(R.id.box_eight_text),
                findViewById(R.id.box_nine_text),
                findViewById(R.id.constraint_layout),
                findViewById(R.id.brown_button),
                findViewById(R.id.yellow_button),
                findViewById(R.id.green_button),
                findViewById(R.id.blue_button),
                findViewById(R.id.pink_button),
            )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_two_text -> view.setBackgroundColor(Color.DKGRAY)

            // Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_six_text -> view.setBackgroundResource(android.R.color.black)
            R.id.box_seven_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.box_eight_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_nine_text -> view.setBackgroundResource(android.R.color.holo_blue_dark)


            R.id.brown_button -> findViewById<View>(R.id.box_one_text).setBackgroundResource(R.color.my_brown_colour)
            R.id.yellow_button -> findViewById<View>(R.id.box_two_text).setBackgroundResource(R.color.my_yellow_colour)
            R.id.green_button -> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_green_colour)
            R.id.blue_button -> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_blue_colour)
            R.id.pink_button -> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_pink_colour)


            else -> view.setBackgroundColor(Color.WHITE)
        }
    }
}