package com.example.constraintslayout.ui.mainActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.example.constraintslayout.ui.onboard.OnboardScreenFragment
import com.example.constraintslayout.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        addFragment(
            OnboardScreenFragment(),
            OnboardScreenFragment.TAG
        )


    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount <= 1){
            finish()
        }
    }

    fun addFragment(fragment:Fragment,tag:String){
        supportFragmentManager.
            beginTransaction().
            replace(R.id.main_activity_container,fragment,tag).
            addToBackStack(tag)
            .commitAllowingStateLoss()
    }


}


