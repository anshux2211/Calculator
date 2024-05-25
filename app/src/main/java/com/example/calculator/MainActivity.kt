package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1:EditText=findViewById(R.id.num1)
        val num2:EditText=findViewById(R.id.num2)
        val add_btn:Button=findViewById(R.id.add)
        val sub_btn:Button=findViewById(R.id.sub)
        val mul_btn:Button=findViewById(R.id.mul)
        val div_btn:Button=findViewById(R.id.div)
        val ans:TextView=findViewById(R.id.ans)

        add_btn.setOnClickListener {
            val s1=num1.text.toString()
            val s2=num2.text.toString()
            if(s1=="" || s2=="")
            {
                ans.text="NULL"
            }
            else {
                val n1 = s1.toInt()
                val n2 = s2.toInt()
                val n3 = n1 + n2
                ans.text = "$n3"
            }
        }
        sub_btn.setOnClickListener {
            val s1=num1.text.toString()
            val s2=num2.text.toString()
            if(s1=="" || s2=="")
            {
                ans.text="NULL"
            }
            else {
                val n1 = s1.toInt()
                val n2 = s2.toInt()
                val n3 = n1 - n2
                ans.text = "$n3"
            }
        }
        mul_btn.setOnClickListener {
            val s1=num1.text.toString()
            val s2=num2.text.toString()
            if(s1=="" || s2=="")
            {
                ans.text="NULL"
            }
            else {
                val n1 = s1.toInt()
                val n2 = s2.toInt()
                val n3 = n1 * n2
                ans.text = "$n3"
            }
        }
        div_btn.setOnClickListener {
            val s1=num1.text.toString()
            val s2=num2.text.toString()
            if(s1=="" || s2=="")
            {
                ans.text="NULL"
            }
            else {
                val n1 = s1.toDouble()
                val n2 = s2.toDouble()
                val n3:Double = n1 / n2
                ans.text = "$n3"
            }
        }
    }
}