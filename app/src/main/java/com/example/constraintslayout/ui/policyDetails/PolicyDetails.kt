package com.example.constraintslayout.ui.policyDetails


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.homeActivity.HomeActivity
import com.example.constraintslayout.ui.policyList.MyPolicyModel
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_policy_details.*

class PolicyDetails : Fragment()
{

    lateinit var adapter: PoliyPagerAdapter
    var currentTab = 0
    var tabCount   = 0
    val policyArray = Array(20) { MyPolicyModel("puneet") }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_policy_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        tabSelectedListner()
        viewPagerListner()
    }


    private fun initialization()
    {
        (activity as HomeActivity).hideBottomNav(true)

        currentTab = 0
        tabCount = policyArray.size
        adapter  = PoliyPagerAdapter(childFragmentManager, policyArray)
        policy_viewPager.adapter = adapter
        policy_tabLayout.setupWithViewPager(policy_viewPager)


    }

    private fun tabSelectedListner()
    {
        policy_tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabSelected(tab: TabLayout.Tab?)
            {
                policy_viewPager.currentItem = tab!!.position
            }

        })

    }

    private fun viewPagerListner()
    {
        this.policy_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int)
            {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                currentTab = position + 1
                println("onPageScrolled: $currentTab")
                println("position: $position")

            }

            override fun onPageSelected(position: Int)
            {
            }

        })

    }


}


class PoliyPagerAdapter(fragmentManager: FragmentManager?, val policyArray: Array<MyPolicyModel>) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment
    {
        val policyListCard      = PolicyCardFragment()
        policyListCard.position = position
        return policyListCard
    }

    override fun getCount(): Int
    {
        return policyArray.size
    }




}
