package com.ywwynm.everythingdone2

import android.app.Application

/**
 * Created by ywwynm on 2017/4/12.
 * Custom [Application] class for EverythingDone 2.
 */
class App : Application() {

    init {
        app = this
    }

    companion object {
        lateinit var app : App
    }

    override fun onCreate() {
        super.onCreate()
    }

}
