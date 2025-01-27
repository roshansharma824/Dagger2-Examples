package com.cheezycode.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appComponent = DaggerUserRegistrationComponent.factory().create(4)

        appComponent.inject(this)

        userRegistrationService.registerUser("cheezycode@gmail.com", "11111" )
    }
}