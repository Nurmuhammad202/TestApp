package uz.toza.testapp.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import uz.toza.testapp.data.remote.model.Product

@Dao
interface ProductDao {

    @Insert
    suspend fun addProducts(product: List<Product>)

    @Query("SELECT * FROM Product")
    suspend fun getProduct():List<Product>
}