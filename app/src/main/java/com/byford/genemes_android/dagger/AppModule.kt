package com.byford.genemes_android.dagger

import android.app.Application
import com.byford.genemes_android.GNApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule constructor(private val application:GNApplication){
    @Provides
    @Singleton
    fun getApplication():Application{
        return application
    }
}