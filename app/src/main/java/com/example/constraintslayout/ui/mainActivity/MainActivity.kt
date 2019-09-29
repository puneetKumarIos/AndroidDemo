package com.example.constraintslayout.ui.mainActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import com.example.constraintslayout.ui.onboard.OnboardScreenFragment
import com.example.constraintslayout.R


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        addFragment(OnboardScreenFragment(), OnboardScreenFragment.TAG)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.backStackEntryCount <= 1){
            finish()
        }
    }

    fun addFragment(fragment: Fragment, tag:String){
        supportFragmentManager.
            beginTransaction().
            replace(R.id.main_activity_container,fragment,tag).
            addToBackStack(tag)
            .commitAllowingStateLoss()
    }


}


