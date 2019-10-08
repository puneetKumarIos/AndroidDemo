package com.example.constraintslayout.ui.RetrofitService.RetrofiltBuilder

import com.example.constraintslayout.ui.RetrofitService.Body.FetchOtpBody
import com.example.constraintslayout.ui.RetrofitService.Response.FetchOtpResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface Api
{

    // FETCH OTP FOR LOGIN
    @POST("serviceOTP")
    fun getOtp(@Body fetchOtpBody: FetchOtpBody):Call<FetchOtpResponse>

}