package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.SubmitBtn.setOnClickListener {
//
//            display()
//        }
//    }
//
//    fun display()
//    {
//        binding.NameTv.text=binding.NameEt.text
//    }
binding.name=getname()

    }
    fun getname(): NameList?
    {
        val myName: NameList = NameList("Aleks Haecky")
return myName
    }
}