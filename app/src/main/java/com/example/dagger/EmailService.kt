package com.example.dagger

import android.util.Log
import com.example.dagger.annotations.ActivityScope
import com.example.dagger.annotations.ApplicationScope
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String)

}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {

    override fun send(to: String, from: String, body: String) {
        Log.e("Swapnil", "Email sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService {
    override fun send(to: String, from: String, body: String) {
        Log.e("Swapnil", "Message sent- retry count $retryCount")
    }

}