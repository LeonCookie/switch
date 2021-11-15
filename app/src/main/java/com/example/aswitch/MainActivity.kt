package com.example.aswitch

import android.app.Activity
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.aswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {





    private lateinit var binding: ActivityMainBinding
    private  lateinit var imie:EditText
    private  lateinit var nazw:EditText
    private  lateinit var mail:EditText
    private  lateinit var wiek:EditText
    private  lateinit var phone:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setCheckedChangeListener()

    }
        private fun setCheckedChangeListener() {


            imie = findViewById<EditText>(R.id.editTextImie)
            nazw = findViewById<EditText>(R.id.editTextImie)
            mail = findViewById<EditText>(R.id.editTextImie)
            wiek = findViewById<EditText>(R.id.editTextImie)
            phone = findViewById<EditText>(R.id.editTextImie)

            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchImie.isEnabled){
                    imie
                }
            }
            binding.switchNazw.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchNazw.isEnabled){

                }
            }
            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchMail.isEnabled){

                }
            }
            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchWiek.isEnabled){

                }
            }
            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchPhone.isEnabled){

                }
            }
        }



    }
