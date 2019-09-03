package com.example.constraintslayout

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_onboard_screen.*


class RegistrationActivity : AppCompatActivity()
{


    val mResources = intArrayOf(R.drawable.ic_walk, R.drawable.paperless, R.drawable.paperless_claim)
    lateinit var adapter: SlidingPagerAdapter
    var currentTab = 0
    var tabCount   = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_onboard_screen)


        tabCount = mResources.size
        adapter  = SlidingPagerAdapter(supportFragmentManager, mResources)
        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)


        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabSelected(tab: TabLayout.Tab?)
            {
                viewPager.currentItem = tab!!.position
            }

        })


        this.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int)
            {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                currentTab = position + 1

                if (currentTab == tabCount) {
                    skip_button.text = "continues"
                } else {
                    skip_button.text = "Skip"
                }
            }

            override fun onPageSelected(position: Int)
            {
            }

        })


        next_button.setOnClickListener {

            if (currentTab == tabCount) {
                skip_button.text = getString(R.string.continues)
            } else {
                skip_button.text = getString(R.string.skip)
                viewPager.currentItem = currentTab
            }

        }

        //setListner()
    }




   /* fun setListner()
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





    }*/


}


class SlidingPagerAdapter(fragmentManager: FragmentManager?, val mResources: IntArray) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment
    {
        return OnboardSlidesFragment().newInstance(position)
    }

    override fun getCount(): Int
    {
        return mResources.size
    }



}

