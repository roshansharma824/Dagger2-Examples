package com.cheezycode.daggerexample

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository(): UserRepository{
//        return FirebaseRepository()
//    }

    @Provides
    fun getSQLRepository(sqlRepository: SQLRepository): UserRepository{
        return sqlRepository
    }
}