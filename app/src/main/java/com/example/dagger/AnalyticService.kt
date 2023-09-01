package com.example.dagger

import android.util.Log

interface AnalyticService {

    fun trackEvent(eventName: String, eventType: String)
}

class MixPanel : AnalyticService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e("Swapnil", "MixPanel - $eventName - $eventType")
    }

}

class FireBaseAnalytic : AnalyticService {
    override fun trackEvent(eventName: String, eventType: String) {
        Log.e("Swapnil", "FireBase - $eventName - $eventType")
    }

}