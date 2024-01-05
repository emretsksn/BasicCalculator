package com.emretaskesen.dortslemkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.emretaskesen.dortslemkotlin.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
    }
    fun topla(view: View){
        val sayi1 = binding.firtstNumber.text.toString().toIntOrNull()
        val sayi2 = binding.secondNumber.text.toString().toIntOrNull()
        if(sayi1==null||sayi2==null){
            binding.sonucText.text= getString(R.string.don_t_forget_to_enter_numbers)
        }else
        {
            val sonuc = sayi1 + sayi2
            binding.sonucText.text= getString(R.string.conclusion, sonuc.toString())
        }
    }
    fun cikar(view: View){
        val sayi1 = binding.firtstNumber.text.toString().toIntOrNull()
        val sayi2 = binding.secondNumber.text.toString().toIntOrNull()
        if(sayi1==null||sayi2==null){
            binding.sonucText.text= getString(R.string.don_t_forget_to_enter_numbers)
        }else
        {
            val sonuc = sayi1 - sayi2
            binding.sonucText.text= getString(R.string.conclusion, sonuc.toString())
        }
    }
    fun bol(view: View){
        val sayi1 = binding.firtstNumber.text.toString().toIntOrNull()
        val sayi2 = binding.secondNumber.text.toString().toIntOrNull()
        if(sayi1==null||sayi2==null){
            binding.sonucText.text= getString(R.string.don_t_forget_to_enter_numbers)
        }else
        {
            val sonuc = sayi1 / sayi2
            binding.sonucText.text= getString(R.string.conclusion, sonuc.toString())
        }
    }
    fun carp(view: View){
        val sayi1 = binding.firtstNumber.text.toString().toIntOrNull()
        val sayi2 = binding.secondNumber.text.toString().toIntOrNull()
        if(sayi1==null||sayi2==null){
            binding.sonucText.text= getString(R.string.don_t_forget_to_enter_numbers)
        }else
        {
            val sonuc = sayi1 * sayi2
            binding.sonucText.text= getString(R.string.conclusion, sonuc.toString())
        }
    }
}