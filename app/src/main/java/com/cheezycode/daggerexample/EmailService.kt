package com.cheezycode.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class EmailService @Inject constructor()  {
    fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Email Sent")
    }
}