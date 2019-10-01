package com.example.constraintslayout.ui.otp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.homeActivity.HomeActivity
import kotlinx.android.synthetic.main.fragment_otp.*

class OtpFrag : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* Variable *********************
    // ==================================================================================//


    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_otp,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        setListner()

    }


    // ==================================================================================//
    // MARK: ********************* Listener *********************
    // ==================================================================================//


    fun setListner() {

        send_otp.setOnClickListener {
            val intent  = Intent(context, HomeActivity::class.java)
                     context?.startActivity(intent)
        }
    }
}