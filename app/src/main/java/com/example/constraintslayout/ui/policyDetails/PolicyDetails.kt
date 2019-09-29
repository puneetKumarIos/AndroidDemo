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

    lateinit var policyAdapter: PoliyPagerAdapter
    var policyCurrentTab = 0
    var policyTabCount   = 0
    val policyArray = Array(5) { MyPolicyModel("puneet") }

    lateinit var memberAdapter: MemberPagerAdapter
    var memberCurrentTab = 0
    var memerTabCount   = 0
    val memberArray = Array(5) { MemberModel("puneet") }


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

        policyCurrentTab = 0
        policyTabCount = policyArray.size
        policyAdapter  = PoliyPagerAdapter(childFragmentManager, policyArray)
        policy_viewPager.adapter = policyAdapter
        policy_tabLayout.setupWithViewPager(policy_viewPager)

        memberCurrentTab = 0
        memerTabCount = memberArray.size
        memberAdapter = MemberPagerAdapter(childFragmentManager,memberArray)
        member_viewPager.adapter = memberAdapter
        member_tabLayout.setupWithViewPager(member_viewPager)

    }

    private fun tabSelectedListner()
    {
        // FOR POLICY
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

        // FOR MEMBER

        member_tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener
        {
            override fun onTabReselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabUnselected(tab: TabLayout.Tab?)
            {
            }

            override fun onTabSelected(tab: TabLayout.Tab?)
            {
                member_viewPager.currentItem = tab!!.position
            }

        })



    }

    private fun viewPagerListner()
    {
        // FOR POLICY

        this.policy_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int)
            {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                policyCurrentTab = position + 1
                println("onPageScrolled: $policyCurrentTab")
                println("position: $position")

            }

            override fun onPageSelected(position: Int)
            {
            }

        })

        // FOR MEMBER
        this.member_viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int)
            {

            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                memberCurrentTab = position + 1
                println("onPageScrolled: $memberCurrentTab")
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



class MemberPagerAdapter(fragmentManager: FragmentManager?, val memberArray: Array<MemberModel>) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment
    {
        val memberCard      = MemberCardFragment()
        memberCard.position = position
        return memberCard
    }

    override fun getCount(): Int
    {
        return memberArray.size
    }




}
