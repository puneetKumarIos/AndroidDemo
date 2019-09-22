package com.example.constraintslayout.ui.policyList


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import kotlinx.android.synthetic.main.fragment_my_policy_list.*


class MyPolicyListFrg : Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my_policy_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        val modelArray = Array(20) { MyPolicyModel("puneet") }

        my_policy_recycler.layoutManager =
            LinearLayoutManager(this.context)
        this.my_policy_recycler.adapter       =
            MyPolicyAdapter(modelArray)

    }


}
