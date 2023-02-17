package uz.toza.testapp.data.di.module

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import uz.toza.testapp.data.room.AppDatabase
import uz.toza.testapp.data.room.ProductDao
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideRoom(context: Context): AppDatabase {
        return Room.databaseBuilder(context = context, AppDatabase::class.java, "Product").build()
    }

    @Singleton
    @Provides
    fun provideGetDao(appDB: AppDatabase): ProductDao {
        return appDB.getProductDao()
    }
}