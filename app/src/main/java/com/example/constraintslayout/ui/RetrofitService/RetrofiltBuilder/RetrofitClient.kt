package com.example.constraintslayout.ui.RetrofitService.RetrofiltBuilder

import com.example.constraintslayout.ui.RetrofitService.ServiceConstant.APP_TOKEN
import com.example.constraintslayout.ui.RetrofitService.ServiceConstant.BASE_URL
import com.example.constraintslayout.ui.RetrofitService.ServiceConstant.URL_SUFFIX
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/*object RetrofitClient
{

    private const val BASE_URL = "https://devapi.amhi.in"
    //private const val BASE_URL = "https://api.amhi.in"


    const val URL_SUFFFIX = "/apis/app/"



    private  val okHttpClient = OkHttpClient.Builder().addInterceptor {chain ->

        val original            = chain.request()
        val requestBuilder =  original.newBuilder().addHeader("","").method(original.method(),original.body())
        val request              =  requestBuilder.build()
        chain.proceed(request)


    }.build()

    val instance: Api by lazy {

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).client(
            okHttpClient
        ).build()

        retrofit.create(Api::class.java)

    }
}*/

object RetrofitClient {


    // Create Logger Interceptor
    var logging   = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    // Create Header Interceptor
    var headerInterceptor   = object : Interceptor {

        override fun intercept(chain: Interceptor.Chain): Response {


            var request = chain.request()

            request  =  request.newBuilder()
                       .addHeader("AppToken",APP_TOKEN)
                       .addHeader("Content-Type","application/json")
                       .build()

            val response = chain.proceed(request)

            return  response
        }


    }


    // Create OkHttp Client
    private val okHttpClient   = OkHttpClient.Builder()
                                                 .callTimeout(60,TimeUnit.SECONDS)
                                                 .addInterceptor(headerInterceptor)
                                                 .addInterceptor(logging)


    // Create Retrofit Builder
    private val builder = Retrofit.Builder().baseUrl(
        BASE_URL + URL_SUFFIX).addConverterFactory(GsonConverterFactory.create()).client(
        okHttpClient.build())




    // Create Retrofit Instance
    private val retrofit = builder.build()



    fun <T>buildService(serviceType:Class<T>) :T
    {
        return  retrofit.create(serviceType)
    }

}


