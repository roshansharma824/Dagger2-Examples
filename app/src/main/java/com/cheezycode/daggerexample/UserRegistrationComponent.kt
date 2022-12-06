package com.cheezycode.daggerexample

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService
}