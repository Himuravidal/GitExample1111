package cl.just4fun.gitexample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cl.just4fun.gitexample.model.Repository
import cl.just4fun.gitexample.model.pojo.PexelData
import kotlinx.coroutines.launch

class PhotoViewModel: ViewModel() {

    private val repository : Repository
    val allPexelData : LiveData<PexelData>

    init {
        repository = Repository()
        allPexelData = repository.liveDataPhoto
    }

    fun getPhotoData(value: String, apiKey: String) = viewModelScope.launch {
        repository.getPhotosFromInternet(value, apiKey)
    }

}