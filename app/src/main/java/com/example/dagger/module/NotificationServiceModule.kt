package com.example.dagger.module

import com.example.dagger.EmailService
import com.example.dagger.annotations.MessageQualifier
import com.example.dagger.MessageService
import com.example.dagger.NotificationService
import com.example.dagger.annotations.ActivityScope
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class NotificationServiceModule() {

    // Default constructor
   // constructor() : this( 0)

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}