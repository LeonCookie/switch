package com.example.aswitch

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {





    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setCheckedChangeListener()

    }
        private fun setCheckedChangeListener() {



            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchImie.isEnabled){

                }
            }
        }



    }
