package com.example.android.marsrealestate

import android.app.Application
import com.google.android.material.color.DynamicColors

class MREApplication: Application() {

    override fun onCreate() {
        DynamicColors.applyToActivitiesIfAvailable(this)
        super.onCreate()
    }

}