package com.example.constraintslayout.ui.policyList

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R

class MyPolicyAdapter(val polcyList: Array<MyPolicyModel>) : RecyclerView.Adapter<MyPolicyAdapter.PolicyViewHolder>()

{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PolicyViewHolder
    {
        val  v = LayoutInflater.from(p0?.context).inflate(R.layout.my_policy_card,p0,false)
        return PolicyViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return  polcyList.size
    }

    override fun onBindViewHolder(p0: PolicyViewHolder, p1: Int)
    {

    }



    class  PolicyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {


    }


}