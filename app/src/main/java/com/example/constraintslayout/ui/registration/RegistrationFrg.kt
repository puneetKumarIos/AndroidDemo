package com.example.constraintslayout.ui.registration


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.ui.forgotPassword.ForgotPasswordFrg
import com.example.constraintslayout.ui.homeActivity.HomeScreenFrg
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.homeActivity.HomeActivity
import com.example.constraintslayout.ui.mainActivity.MainActivity
import kotlinx.android.synthetic.main.fragment_registration.*


class RegistrationFrg : Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_registration, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        setListner()
    }

    fun setListner()
    {

      forgot_password_button.setOnClickListener {

          println("Forgot Password Button tapped")

          (activity as MainActivity).addFragment(ForgotPasswordFrg(),"")

      }





      login_button.setOnClickListener {

          println("Login Button tapped")

      }



      otp_login_button.setOnClickListener {

          println("Login Using Otp Button tapped")

          //(activity as MainActivity).addFragment(HomeScreenFrg(),"")

//          activity?.let{
//              val intent = Intent (it, HomeActivity::class.java)
//              it.startActivity(intent)
//          }

          val intent  = Intent(context,HomeActivity::class.java)
          context?.startActivity(intent)


      }



      login_trouble_button.setOnClickListener {

          println("Login Trouble Button tapped")

      }




      facebook_button.setOnClickListener {

          println("Facebook Button tapped")

      }



      google_button.setOnClickListener {

          println("Google Button tapped")

      }



      create_account_button.setOnClickListener {

          println("Create Account Button tapped")
      }


      tc_button.setOnClickListener {

          println("TC Button tapped")
      }




      privacy_policy_button.setOnClickListener {

          println("Privacy Policy Button tapped")
      }



      faqs_button.setOnClickListener {

          println("Faqs Button tapped")
      }





  }


}

