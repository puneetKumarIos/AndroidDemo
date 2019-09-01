package com.example.constraintslayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_login.*


class RegistrationActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home_no_scroll_new)

        //setListner()
    }




    fun setListner()
    {

        forgot_password.setOnClickListener {

            println("Forgot Password Button tapped")

            val  frag = ForgotPasswordFrg()
            supportFragmentManager.beginTransaction().replace(R.id.login_container,frag,"").addToBackStack("").commit()
        }





        login.setOnClickListener {

            println("Login Button tapped")

        }



        otp_login.setOnClickListener {

            println("Login Using Otp Button tapped")

        }



        login_trouble.setOnClickListener {

            println("Login Trouble Button tapped")

        }




        facebook.setOnClickListener {

            println("Facebook Button tapped")

        }



        google.setOnClickListener {

            println("Google Button tapped")

        }



        create_account.setOnClickListener {

            println("Create Account Button tapped")
        }


        tc.setOnClickListener {

            println("TC Button tapped")
        }




        privacy_policy.setOnClickListener {

            println("Privacy Policy Button tapped")
        }



        faqs.setOnClickListener {

            println("Faqs Button tapped")
        }





    }


}
