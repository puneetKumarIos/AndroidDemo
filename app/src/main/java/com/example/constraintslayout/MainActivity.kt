package com.example.constraintslayout
import android.os.Bundle
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    /*val mResources = intArrayOf(R.drawable.paperless, R.drawable.ic_policy,R.drawable.ic_walk)
    lateinit var adapter: SlidingPagerAdapter
    var currentTab = 0
    var tabCount   = 0*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main_activity)

           val fragmenttransation = supportFragmentManager?.beginTransaction()
           fragmenttransation?.add(R.id.main_activity_container,OnboardScreenFragment())
           fragmenttransation?.commit()

        /*initialization()
        tabSelectedListner()
        viewPagerListner()
        buttonListner()*/


    }
}




  /*  private fun initialization()
    {
        tabCount = mResources.size
        adapter  = SlidingPagerAdapter(supportFragmentManager, mResources)
        viewPager.adapter = adapter
        tabLayout.setupWithViewPager(viewPager)
        println("tabCount :: $tabCount")


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

            viewPager.currentItem = currentTab
            setSkipText()
        }

        skip_button.setOnClickListener {

           supportFragmentManager.beginTransaction().replace(R.id.onboard_screen_container,RegistrationFragment(),"").addToBackStack("").commit()

        }



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

*/