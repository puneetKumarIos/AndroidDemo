package com.example.constraintslayout
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.fragment_main_activity)

        addFragment(OnboardScreenFragment(),OnboardScreenFragment.TAG)


    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount <= 1){
            finish()
        }
    }

    public fun addFragment(fragment:Fragment,tag:String){
        supportFragmentManager.
            beginTransaction().
            replace(R.id.main_activity_container,fragment,tag).
            addToBackStack(tag)
            .commitAllowingStateLoss()
    }


}


