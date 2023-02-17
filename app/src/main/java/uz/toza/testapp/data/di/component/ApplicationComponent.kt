package uz.toza.testapp.data.di.component

import android.content.Context
import dagger.BindsInstance
import dagger.Component
import uz.toza.testapp.MainActivity
import uz.toza.testapp.data.di.module.DatabaseModule
import uz.toza.testapp.data.di.module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponent
    }
}