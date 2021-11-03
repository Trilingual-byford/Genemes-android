package com.byford.genemes_android.dagger

import com.byford.genemes_android.GNApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent {
    @Component.Builder
    interface Builder {
        fun appModule(module: AppModule): Builder
        fun build(): AppComponent
    }

    fun inject(app: GNApplication)
}