package com.example.dagger

import android.app.Application
import com.example.dagger.component.ApplicationComponent
import com.example.dagger.component.DaggerApplicationComponent

class UserApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.builder().build()

    }
}