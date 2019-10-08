package com.example.constraintslayout.ui.Fragments.Onboard


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import android.view.View
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.Activities.MainActivity
import com.example.constraintslayout.ui.Fragments.Registration.RegistrationFrg
import kotlinx.android.synthetic.main.fragment_onboard_screen.*

class OnboardScreenFragment : Fragment()
{

    val mResources = intArrayOf(
        R.drawable.paperless,
        R.drawable.ic_policy,
        R.drawable.ic_walk
    )

    lateinit var adapter: SlidingPagerAdapter
    var currentTab = 0
    var tabCount   = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.fragment_onboard_screen, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        tabSelectedListner()
        viewPagerListner()
        buttonListner()
    }


      private fun initialization()
      {
          currentTab = 0
          tabCount = mResources.size
          adapter  = SlidingPagerAdapter(
              childFragmentManager,
              mResources
          )
          viewPager.adapter = adapter
          tabLayout.setupWithViewPager(viewPager)
          println("policyTabCount :: $tabCount")


      }

      private fun tabSelectedListner()
      {
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

      }

      private fun viewPagerListner()
      {
          this.viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

              override fun onPageScrollStateChanged(state: Int)
              {

              }

              override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

                  currentTab = position + 1
                  println("onPageScrolled: $currentTab")
                  println("position: $position")


                  setSkipText()

              }

              override fun onPageSelected(position: Int)
              {
              }

          })

      }

      private fun buttonListner()
      {
          next_button.setOnClickListener {

              if (currentTab == tabCount){
                  moveToLoginScreen()
              }else{
                  viewPager.currentItem = currentTab
                  setSkipText()
              }

          }

          skip_button.setOnClickListener {

            moveToLoginScreen()

          }

      }

    private fun moveToLoginScreen()
    {
        (activity as MainActivity).addFragment(RegistrationFrg(),"")
    }

    private fun setSkipText()
    {
          if (currentTab == tabCount) {
              next_button.text       = getString(R.string.DONE)
              skip_button.visibility = View.GONE
          } else {
              next_button.text       = getString(R.string.NEXT)
              skip_button.visibility = View.VISIBLE

          }

      }

    companion object{
        val TAG = OnboardScreenFragment::class.java.simpleName
    }


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