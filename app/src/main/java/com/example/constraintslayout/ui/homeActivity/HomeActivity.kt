package com.example.constraintslayout.ui.homeActivity

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.constraintslayout.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity()
{
    private lateinit var navController: NavController


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setBottomNav()
    }



    fun setBottomNav()
    {
        /*val navView: BottomNavigationView = findViewById(R.id.dashboard_nav_view)
        val navController    = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home,
                R.id.navigation_my_claims,
                R.id.navigation_my_policy,
                R.id.navigation_stay_active,
                R.id.navigation_more
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)*/




        //Getting the Navigation Controller
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        //Setting the navigation controller to Bottom Nav
        dashboard_nav_view.setupWithNavController(navController)


        //Setting up the action bar
        NavigationUI.setupActionBarWithNavController(this, navController)
    }





}
