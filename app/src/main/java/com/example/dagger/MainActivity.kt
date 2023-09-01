package com.example.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val applicationComponent = (application as UserApplication).applicationComponent
        var userRegistrationComponent = applicationComponent.getUserRegistrationComponentBuilder().retryCount(3).build()
        userRegistrationComponent.inject(this)

        userRegistrationService.registerUser("swapnil143@gmail.com", "11111")


    }
}