package com.cheezycode.daggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)
}