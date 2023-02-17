package uz.toza.testapp.app

import android.app.Application
import dagger.Component
import uz.toza.testapp.data.di.component.ApplicationComponent
import uz.toza.testapp.data.di.component.DaggerApplicationComponent

class MyApplication : Application() {
    lateinit var applicationComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}