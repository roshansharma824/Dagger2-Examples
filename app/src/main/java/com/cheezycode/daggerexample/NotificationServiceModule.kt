package com.cheezycode.daggerexample

import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getNotificationService(): NotificationService{
        return MessageService()
    }
}