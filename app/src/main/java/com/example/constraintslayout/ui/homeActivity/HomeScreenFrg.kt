package com.example.constraintslayout.ui.homeActivity


import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
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


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_home_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }



    }
