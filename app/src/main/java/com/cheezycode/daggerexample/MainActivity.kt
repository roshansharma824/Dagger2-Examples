package com.cheezycode.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = DaggerUserRegistrationComponent.builder().build()
        val userRegistrationService = appComponent.getUserRegistrationService()

        userRegistrationService.registerUser("cheezycode@gmail.com", "11111" )
    }
}