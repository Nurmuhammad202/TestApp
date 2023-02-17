package uz.toza.testapp.data.repository

import retrofit2.Response
import uz.toza.testapp.data.remote.model.Product
import uz.toza.testapp.data.remote.rest.RepoService
import uz.toza.testapp.data.room.ProductDao
import javax.inject.Inject

class NetworkRepository @Inject constructor(
    private val apiInterface: RepoService,
    private val productDao: ProductDao
) {

    suspend fun getProducts(): Response<List<Product>> {
        val list = apiInterface.getProduct()

        list.body()?.let {
            productDao.addProducts(it)
        }


        return list
    }

    suspend fun getProduct(): List<Product> = productDao.getProduct()


}