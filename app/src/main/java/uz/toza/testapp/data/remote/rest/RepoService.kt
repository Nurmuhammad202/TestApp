package uz.toza.testapp.data.remote.rest

import retrofit2.Response
import retrofit2.http.GET
import uz.toza.testapp.data.remote.model.Product

interface RepoService {

    @GET("products")
    suspend fun getProduct(): Response<List<Product>>
}