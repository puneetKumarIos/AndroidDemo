package com.example.constraintslayout.ui.policyList

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.constraintslayout.R

class MyPolicyAdapter(val polcyList: Array<MyPolicyModel>,val clickListner:(Int) -> Unit) : RecyclerView.Adapter<MyPolicyAdapter.PolicyViewHolder>()

{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PolicyViewHolder
    {
        val  v = LayoutInflater.from(p0.context).inflate(R.layout.my_policy_card,p0,false)
        return PolicyViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return  polcyList.size
    }

    override fun onBindViewHolder(p0: PolicyViewHolder, p1: Int)
    {
        p0.bind(p1,clickListner)


    }



    class  PolicyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(position: Int, clickListener: (Int) -> Unit)
        {

            itemView.setOnClickListener {
                clickListener(position)
               // Navigation.createNavigateOnClickListener(R.id.action_navigation_my_claims_to_claimDetailsFrg, null)
            }
            itemView.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_navigation_my_policy_to_policyDetails, null))
        }

    }


}