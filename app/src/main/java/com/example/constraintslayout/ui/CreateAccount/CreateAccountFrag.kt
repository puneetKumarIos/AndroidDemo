package com.example.constraintslayout.ui.CreateAccount

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import kotlinx.android.synthetic.main.fragment_otp.*

class CreateAccountFrag : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* Variable *********************
    // ==================================================================================//


    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_create_account,container,false)

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

        }
    }
}