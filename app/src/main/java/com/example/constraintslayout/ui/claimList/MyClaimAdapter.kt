package com.example.constraintslayout.ui.claimList

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.homeActivity.HomeActivity

class MyClaimAdapter(val claimList: Array<MyClaimModel>, val clickListner:(Int) -> Unit) : RecyclerView.Adapter<MyClaimAdapter.ClaimViewHolder>()

{

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ClaimViewHolder
    {
        val  v = LayoutInflater.from(p0?.context).inflate(R.layout.my_claim_card,p0,false)
        return ClaimViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return  claimList.size
    }

    override fun onBindViewHolder(p0: ClaimViewHolder, p1: Int)
    {

        p0.bind(p1,clickListner)

    }



    class  ClaimViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {
        fun bind(position: Int, clickListener: (Int) -> Unit)
        {
//            itemView.setOnClickListener {
//                clickListener(position)
//               // Navigation.createNavigateOnClickListener(R.id.action_navigation_my_claims_to_claimDetailsFrg, null)
//            }


            itemView.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_navigation_my_claims_to_claimDetailsFrg, null))

        }

    }


}