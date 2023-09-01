package com.example.dagger

import com.example.dagger.annotations.MessageQualifier
import javax.inject.Inject


class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
   @MessageQualifier private val notificationService: NotificationService
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "no-replay@swap.com", "user registered")
    }
}