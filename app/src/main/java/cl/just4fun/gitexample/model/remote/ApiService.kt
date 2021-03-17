package cl.just4fun.gitexample.model.remote
import cl.just4fun.gitexample.model.pojo.PexelData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {

@GET("search")
suspend fun getPhotosFromInternet(@Query("query")value: String,
                                  @Header("Authorization") apiKey: String) :
        Response<PexelData>

}