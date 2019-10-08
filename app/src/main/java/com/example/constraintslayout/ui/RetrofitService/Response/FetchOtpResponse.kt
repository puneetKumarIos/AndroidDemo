package com.example.constraintslayout.ui.RetrofitService.Response

import com.google.gson.annotations.SerializedName


class FetchOtpResponse(

        @SerializedName("entityValue")
        val entityValue: String? =null,

        @SerializedName("entityType")
        val entityType: String? = null,

        @SerializedName("message")
        val message: String? = null,

        @SerializedName("statusCode")
        val statusCode: Int? = null)