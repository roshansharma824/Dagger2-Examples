package com.cheezycode.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String){
        Log.d(TAG,"Save User to DB")
    }
}