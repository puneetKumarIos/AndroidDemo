package com.example.constraintslayout.ui.registration


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.ui.forgotPassword.ForgotPasswordFrg
import com.example.constraintslayout.ui.mainActivity.MainActivity
import com.example.constraintslayout.ui.otp.OtpEmailFrag
import kotlinx.android.synthetic.main.fragment_registration.*
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.CreateAccountFrag


class RegistrationFrg : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* Variable *********************
    // ==================================================================================//


    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        setListner()
    }


    // ==================================================================================//
    // MARK: ********************* Listener *********************
    // ==================================================================================//


    fun setListner()
    {

      forgot_password_button.setOnClickListener {

          (activity as MainActivity).addFragment(ForgotPasswordFrg(),"")
      }

      login_button.setOnClickListener {

      }

      otp_login_button.setOnClickListener {

          (activity as MainActivity).addFragment(OtpEmailFrag(),"")

          /*val intent  = Intent(context,HomeActivity::class.java)
          context?.startActivity(intent)*/
      }

      login_trouble_button.setOnClickListener {

      }

      facebook_button.setOnClickListener {

      }

      google_button.setOnClickListener {

      }

      create_account_button.setOnClickListener {
          (activity as MainActivity).addFragment(CreateAccountFrag(),"")

      }

      tc_button.setOnClickListener {
      }

      privacy_policy_button.setOnClickListener {
      }

      faqs_button.setOnClickListener {

      }
    }



    // ==================================================================================//
    // MARK: ********************* Private Method *********************
    // ==================================================================================//


    /*protected fun getPixelsFromDPs(dps: Int): Int {


        val r = this.context.getResources()
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, dps.toFloat(), r.getDisplayMetrics()
        ).toInt()
    }*/

    // ==================================================================================//
    // MARK: ********************* Public Method *********************
    // ==================================================================================//




}

