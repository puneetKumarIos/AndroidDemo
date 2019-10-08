package com.example.constraintslayout.ui.Fragments.Otp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.Activities.MainActivity
import com.example.constraintslayout.ui.RetrofitService.Body.FetchOtpBody
import com.example.constraintslayout.ui.RetrofitService.Response.FetchOtpResponse
import com.example.constraintslayout.ui.RetrofitService.RetrofiltBuilder.Api
import com.example.constraintslayout.ui.RetrofitService.RetrofiltBuilder.RetrofitClient
import kotlinx.android.synthetic.main.fragment_otp.*
import kotlinx.android.synthetic.main.fragment_otp.send_otp
import kotlinx.android.synthetic.main.fragment_otp_email.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class OtpEmailFrag : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* VARIABLE *********************
    // ==================================================================================//

    val fetchOtpBody:FetchOtpBody = FetchOtpBody(action = "SEND_USER_OTP",entityValue = "grid1@gmail.com",entityType = "EMAIL")

    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_otp_email,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        setListner()
        setUpUi()
        initialization()

    }

    // ==================================================================================//
    // MARK: ********************* LISTENER *********************
    // ==================================================================================//


    fun setListner() {

        send_otp.setOnClickListener {

            fetchOtp()
        }
    }


    // ==================================================================================//
    // MARK: ********************* PRIVATE METHOD *********************
    // ==================================================================================//


    private fun setUpUi()
    {

    }

    private fun initialization()
    {
    }


    // ==================================================================================//
    // MARK: ********************* SERVICE  *********************
    // ==================================================================================//
    fun fetchOtp()
    {
        val otpService               = RetrofitClient.buildService(Api::class.java)
        val request  = otpService.getOtp(fetchOtpBody)

        request.enqueue(object :Callback<FetchOtpResponse> {


            override fun onResponse(call: Call<FetchOtpResponse>, response: Response<FetchOtpResponse>) {


                if (response.isSuccessful)
                {
                    Toast.makeText(context,"Got Otp Successfullt",Toast.LENGTH_SHORT).show()
                    val  body = response.body()
                    println("OTP RESPONSE :: ${body.toString()}")

                    (activity as MainActivity).addFragment(OtpFrag(), "")

                }else{
                    Toast.makeText(context,"Failed to Get Otp",Toast.LENGTH_SHORT).show()

                }
            }

            override fun onFailure(call: Call<FetchOtpResponse>, t: Throwable) {
                Toast.makeText(context,"Failed to Get Otp",Toast.LENGTH_SHORT).show()

            }


        })



    }


}


