package com.example.dagger.module

import com.example.dagger.FireBaseRepository
import com.example.dagger.SQLRepository
import com.example.dagger.UserRepository
import com.example.dagger.annotations.ActivityScope
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository): UserRepository
}