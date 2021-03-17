package cl.just4fun.gitexample.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import cl.just4fun.gitexample.model.pojo.PexelData
import cl.just4fun.gitexample.model.remote.RetrofitClient

class Repository {

    private val retrofit = RetrofitClient.retrofitInstance()
    val liveDataPhoto  =  MutableLiveData<PexelData>()

    suspend fun getPhotosFromInternet(value: String, apiKey: String) {
        val service = kotlin.runCatching { retrofit.getPhotosFromInternet(value, apiKey) }
        service.onSuccess {
                liveDataPhoto.value = it.body()
        }
        service.onFailure {
            Log.d("ERROR", "$it")
        }

    }


}