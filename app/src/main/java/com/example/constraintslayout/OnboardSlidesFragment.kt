package com.example.constraintslayout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_onboard_slides.*

class OnboardSlidesFragment : Fragment()
{
    private var position   = 0
    private val mResources = intArrayOf(R.drawable.paperless, R.drawable.ic_policy,R.drawable.ic_walk)


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {

        return inflater.inflate(R.layout.fragment_onboard_slides, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?)
    {
        super.onActivityCreated(savedInstanceState)

        val args = this.arguments
        position = args?.getInt("POSITION") ?: 0

        this.walkthrough_imageView.setImageResource(this.mResources[this.position])

    }




    fun newInstance(position: Int): OnboardSlidesFragment
    {
        val fragment  = OnboardSlidesFragment()
        val arguments = Bundle()
        arguments.putInt("POSITION", position)
        fragment.setArguments(arguments)
        return fragment
    }

}

