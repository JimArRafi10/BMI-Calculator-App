package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener{
            var weight:Double= etweight.text.toString().toDouble()
            var height:Double= etheight.text.toString().toDouble()

            var bmi:Double=(weight*703)/(height*height)

            info.visibility= View.VISIBLE
            tvinfo.text="BMI is ${String.format("%.2f",bmi)} you are ${bmirRes(bmi)}"
        }

    }

    fun bmirRes(bmi: Double): String{
        var ans=""
        if(bmi<18.5){
            ans="Underweight"
        }
        else if(bmi>18.5 && bmi<29.9){
            ans="Overweight"
        }
        else{
            ans="Obese"
        }
        return ans
    }
}