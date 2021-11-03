package com.byford.genemes_android

import android.app.Application
import com.byford.genemes_android.dagger.AppComponent
import com.byford.genemes_android.dagger.AppModule
import com.byford.genemes_android.dagger.DaggerAppComponent

class GNApplication:Application() {
    companion object{
        private lateinit var appComponent:AppComponent
    }
    fun getAppComponent(): AppComponent {
        return appComponent
    }
    override fun onCreate() {
        super.onCreate()
        initDaggerAppComponent()
    }

    private fun initDaggerAppComponent(): AppComponent {
        appComponent =
            DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .build()
        return appComponent
    }
}