package com.example.homework3

import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import java.util.regex.Matcher


class MainActivity : AppCompatActivity() {

    //private var emailPattern = "[a-zA-Z0-9._-]+@[a-z]+.+[a-z]+"
    private var emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.btnSave).setOnClickListener(){
            if (emailCheck()){
                save()
            }else{
                findViewById<AppCompatEditText>(R.id.email).error = "Invalid Format"
            }
        }

        findViewById<AppCompatButton>(R.id.btnClear).setOnLongClickListener {
            clear()
            true
        }
    }


    private fun save(){

        //email Filed
        if(TextUtils.isEmpty(findViewById<AppCompatEditText>(R.id.email).text.toString())){
            findViewById<AppCompatEditText>(R.id.email).error = "Field Is Empty"
        }

        //userName Filed
        if(TextUtils.isEmpty(findViewById<AppCompatEditText>(R.id.userName).text.toString())){
            findViewById<AppCompatEditText>(R.id.userName).error = "Field Is Empty"
        }
        if(findViewById<AppCompatEditText>(R.id.userName).text.toString().length in 1.. 9){
            findViewById<AppCompatEditText>(R.id.userName).error = "Min 10 Symbol"
        }

        //firstName Filed
        if(TextUtils.isEmpty(findViewById<AppCompatEditText>(R.id.firstName).text.toString())){
            findViewById<AppCompatEditText>(R.id.firstName).error = "Field Is Empty"
        }

        //lastName Filed
        if(TextUtils.isEmpty(findViewById<AppCompatEditText>(R.id.lastName).text.toString())){
            findViewById<AppCompatEditText>(R.id.lastName).error = "Field Is Empty"
        }

        //age Filed
        if(TextUtils.isEmpty(findViewById<AppCompatEditText>(R.id.age).text.toString())){
            findViewById<AppCompatEditText>(R.id.age).error = "Field Is Empty"
        }
    }


    private fun clear(){
        //email Filed
        findViewById<AppCompatEditText>(R.id.email).text?.clear()
        findViewById<AppCompatEditText>(R.id.email).error = null

        //userName Filed
        findViewById<AppCompatEditText>(R.id.userName).text?.clear()
        findViewById<AppCompatEditText>(R.id.userName).error = null

        //firstName Filed
        findViewById<AppCompatEditText>(R.id.firstName).text?.clear()
        findViewById<AppCompatEditText>(R.id.firstName).error = null

        //lastName Filed
        findViewById<AppCompatEditText>(R.id.lastName).text?.clear()
        findViewById<AppCompatEditText>(R.id.lastName).error = null

        //age Filed
        findViewById<AppCompatEditText>(R.id.age).text?.clear()
        findViewById<AppCompatEditText>(R.id.age).error = null
    }


    private fun emailCheck(): Boolean{
        return findViewById<AppCompatEditText>(R.id.email).text.toString().trim { it <= ' ' }.matches(emailPattern.toRegex())
    }



}