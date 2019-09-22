package com.example.constraintslayout.ui.homeActivity


import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.ui.more.MoreFrg
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.stayActive.StayActiveFrg
import com.example.constraintslayout.ui.claimList.MyClaimListFrg
import com.example.constraintslayout.ui.mainActivity.MainActivity
import com.example.constraintslayout.ui.policyList.MyPolicyListFrg
import kotlinx.android.synthetic.main.fragment_home_screen.*

class HomeScreenFrg : Fragment()
{

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
        when (menuItem.itemId)
        {
            R.id.navigation_home ->
            {
                val fragment = HomeScreenFrg()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my_policy ->
            {
                val fragment = MyPolicyListFrg()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_my_claims ->
            {
                val fragment = MyClaimListFrg()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

            R.id.navigation_stay_active ->
            {
                val fragment = StayActiveFrg()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_more ->
            {
                val fragment = MoreFrg()
                showFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //this.navigation_bar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }


    fun showFragment(fragment:Fragment)
    {
         (activity as MainActivity).addFragment(fragment,"")

    }




    }
