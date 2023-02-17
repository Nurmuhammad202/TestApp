package uz.toza.testapp.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import uz.toza.testapp.data.remote.model.Product

@Database(entities = [Product::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getProductDao(): ProductDao
}