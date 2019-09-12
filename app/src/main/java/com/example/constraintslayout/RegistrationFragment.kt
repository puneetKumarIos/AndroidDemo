package com.example.constraintslayout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_registration.*


class RegistrationFragment : Fragment()
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


           /*val fragmenttransation = fragmentManager?.beginTransaction()
           fragmenttransation?.add(R.id.main_activity_container,ForgotPasswordFrg())
           fragmenttransation?.commit()*/


          /* val  frag = ForgotPasswordFrg()
           fragmentManager?.beginTransaction()?.replace(R.id.main_activity_container,frag,"")?.addToBackStack("")
              ?.commit()*/
          (activity as MainActivity).addFragment(ForgotPasswordFrg(),"")

      }





      login_button.setOnClickListener {

          println("Login Button tapped")

      }



      otp_login_button.setOnClickListener {

          println("Login Using Otp Button tapped")

//          val  frag = HomeScreen()
//          fragmentManager?.beginTransaction()?.replace(R.id.main_activity_container,frag,"")?.addToBackStack("")
//              ?.commit()

          (activity as MainActivity).addFragment(HomeScreen(),"")


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

