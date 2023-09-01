package com.example.dagger.component

import com.example.dagger.AnalyticService
import com.example.dagger.module.AnalyticModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticModule::class])
interface ApplicationComponent {

    fun getUserRegistrationComponentBuilder() :UserRegistrationComponent.Builder

}