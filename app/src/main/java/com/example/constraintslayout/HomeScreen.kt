package com.example.constraintslayout


import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home_screen_aspect_ratio.*

class HomeScreen : Fragment()
{

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId)
        {
            R.id.nav_home ->
            {
                val fragment = HomeScreen()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_policy ->
            {
                val fragment = MyPolicy()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_claims ->
            {
                val fragment = MyPolicy()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_stay_active ->
            {
                val fragment = StayActive()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_more ->
            {
                val fragment = More()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        this.navigation_bar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        return inflater.inflate(R.layout.fragment_home_screen_aspect_ratio, container, false)
    }


    fun showFragment(fragment:Fragment)
    {
        val fragmentTransaction = activity?.supportFragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.home_container,fragment)
        fragmentTransaction?.commit()

    }




    }
