package com.example.constraintslayout.ui.RetrofitService.Body

import com.google.gson.annotations.SerializedName


class FetchOtpBody(

        @SerializedName("action")
        val action: String?,

        @SerializedName("entityValue")
        val entityValue: String? =null,

        @SerializedName("entityType")
        val entityType: String? = null,

        @SerializedName("otp")
        val otp: String? = null,

        @SerializedName("otpFormat")
        val otpFormat:String? = "SAME")
