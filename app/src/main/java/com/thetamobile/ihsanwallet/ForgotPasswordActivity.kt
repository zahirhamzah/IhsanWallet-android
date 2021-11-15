package com.thetamobile.ihsanwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var option : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        supportActionBar!!.hide()

        option  =   findViewById(R.id.sp_option)

        var options = arrayOf("+60", "+65", "+20")
        option.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, options )

        option.onItemSelectedListener   =   object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

    }
}