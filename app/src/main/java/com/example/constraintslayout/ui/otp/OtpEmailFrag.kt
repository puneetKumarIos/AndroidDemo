package com.example.constraintslayout.ui.otp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.mainActivity.MainActivity
import kotlinx.android.synthetic.main.fragment_otp.*

class OtpEmailFrag : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* Variable *********************
    // ==================================================================================//


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

    }

    // ==================================================================================//
    // MARK: ********************* Listener *********************
    // ==================================================================================//


    fun setListner() {

        send_otp.setOnClickListener {

            (activity as MainActivity).addFragment(OtpFrag(), "")
        }
    }


}