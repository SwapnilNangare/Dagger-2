package com.example.dagger.component

import com.example.dagger.annotations.ApplicationScope
import com.example.dagger.MainActivity
import com.example.dagger.annotations.ActivityScope
import com.example.dagger.module.AnalyticModule
import com.example.dagger.module.NotificationServiceModule
import com.example.dagger.module.UserRepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {


    fun inject(mainActivity: MainActivity)


    @Subcomponent.Builder
    interface Builder {

        fun build(): UserRegistrationComponent
        fun retryCount(@BindsInstance retryCount: Int): Builder

    }


}