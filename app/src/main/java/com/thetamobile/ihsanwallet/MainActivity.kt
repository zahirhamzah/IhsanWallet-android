package com.thetamobile.ihsanwallet

import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var register : TextView
    lateinit var forgotpassword : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide()

        register = findViewById(R.id.createAccount)
        register.paintFlags = register.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        option  =   findViewById(R.id.sp_option)

        var options = arrayOf("+60")
        option.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, options )

        option.onItemSelectedListener   =   object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected( parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        forgotpassword = findViewById(R.id.forgetPassword)

        forgotpassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}