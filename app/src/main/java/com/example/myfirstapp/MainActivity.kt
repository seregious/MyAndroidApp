package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding
    val a = 228
    val b = 322

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.numbers.text = a.toString() + " и " + b.toString()

        bindingClass.plus.setOnClickListener {
            bindingClass.result.text = (a + b).toString()
        }

        bindingClass.minus.setOnClickListener {
            bindingClass.result.text = (b - a).toString()
        }

        bindingClass.multiply.setOnClickListener {
            bindingClass.result.text = (a * b).toString()
        }

        Log.d("hello", "there")



    }

    fun onClick(view: View) {
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }
}