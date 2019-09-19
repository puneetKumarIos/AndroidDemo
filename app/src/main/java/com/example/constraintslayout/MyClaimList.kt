package com.example.constraintslayout


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_my_claim_list.*


class MyClaimList : Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my_claim_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        val modelArray = Array(20) { MyClaimModel("puneet") }

        my_claim_recycler.layoutManager      = LinearLayoutManager(this.context)
        this.my_claim_recycler.adapter       = MyClaimAdapter(modelArray)

    }


}
