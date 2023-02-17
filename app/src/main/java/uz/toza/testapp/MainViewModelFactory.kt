package uz.toza.testapp

import android.widget.ViewSwitcher.ViewFactory
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.toza.testapp.data.repository.NetworkRepository
import uz.toza.testapp.ui.MainViewModel
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private var repository: NetworkRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository = repository) as T
    }
}