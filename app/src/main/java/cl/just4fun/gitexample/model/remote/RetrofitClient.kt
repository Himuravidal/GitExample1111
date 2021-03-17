package cl.just4fun.gitexample.model.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{
        private const val BASE_URL= "https://api.pexels.com/v1/"

        fun retrofitInstance(): ApiService {
            val retrofitClient = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofitClient.create(ApiService::class.java)
        }
    }
}