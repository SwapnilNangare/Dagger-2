package com.example.dagger.module

import com.example.dagger.AnalyticService
import com.example.dagger.MixPanel
import com.example.dagger.annotations.ApplicationScope
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AnalyticModule {

    @Singleton
    @Provides
    fun getAnalyticService(): AnalyticService {
        return MixPanel()
    }
}