package com.example.dagger

import android.util.Log
import com.example.dagger.annotations.ActivityScope
import com.example.dagger.annotations.ApplicationScope
import javax.inject.Inject


interface UserRepository {
    fun saveUser(email: String, password: String)

}

@ActivityScope
class SQLRepository @Inject constructor(val analyticService: AnalyticService) : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.e("Swapnil", "User Saved in DB")
        analyticService.trackEvent("Save User","CREATE")
    }
}

class FireBaseRepository(val analyticService: AnalyticService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.e("Swapnil", "User Saved in FireBase")
        analyticService.trackEvent("Save User","CREATE")
    }

}