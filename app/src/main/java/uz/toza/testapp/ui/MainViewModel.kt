package uz.toza.testapp.ui

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import uz.toza.testapp.data.remote.model.Product
import uz.toza.testapp.data.repository.NetworkRepository

class MainViewModel(private val repository: NetworkRepository) : ViewModel() {

    private val _products = MutableLiveData<List<Product>>()
    val product: LiveData<List<Product>> = _products
    fun getProduct() = viewModelScope.launch {
        repository.getProducts().let {
            if (it.isSuccessful && it.code() == 200) {
                it.body()?.let { productLocal ->
                    Log.d(TAG, "getProductdssdfdsfd:-$productLocal ")
                    _products.value = productLocal
                }
            }
        }
    }

    fun getProductByLocal()=viewModelScope.launch {
        _products.value=repository.getProduct()
    }
}