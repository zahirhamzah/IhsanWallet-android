package com.thetamobile.ihsanwallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MembershipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership)

        supportActionBar!!.hide()

    }
}