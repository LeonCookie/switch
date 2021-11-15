package com.example.aswitch

import android.app.Activity
import android.graphics.Color
import android.graphics.Color.RED
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
                    imie.isEnabled = false
                    imie.isClickable = false;
                    imie.setHintTextColor(Color.RED)
                }else{
                    imie.isEnabled = true
                    imie.isClickable = true
                    imie.setHintTextColor(Color.GREEN)

                }
            }
            binding.switchNazw.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchNazw.isEnabled) {
                    nazw.isEnabled = false
                    nazw.isClickable = false
                    nazw.setHintTextColor(Color.RED)

                }else{
                    nazw.isEnabled = true
                    nazw.isClickable = true
                    nazw.setHintTextColor(Color.GREEN)


                }
            }
            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchMail.isEnabled){
                    mail.isEnabled = false
                    mail.isClickable = false
                    mail.setHintTextColor(Color.RED)
                }else{

                        mail.isEnabled = true
                        mail.isClickable = true
                    mail.setHintTextColor(Color.GREEN)

                    }
                }

            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchWiek.isEnabled){
                    wiek.isEnabled = false
                    wiek.isClickable = false
                    wiek.setHintTextColor(Color.RED)
                }else{
                    wiek.isEnabled = true
                    wiek.isClickable = true
                    wiek.setHintTextColor(Color.GREEN)
                }
            }
            binding.switchImie.setOnCheckedChangeListener { _, isChecked ->

                if(binding.switchPhone.isEnabled){
                    phone.isEnabled = false
                    phone.isClickable = false
                    phone.setHintTextColor(Color.RED)
                }else{
                    phone.isEnabled = true
                    phone.isClickable = true
                    phone.setHintTextColor(Color.GREEN)
                }
            }
        }



    }
