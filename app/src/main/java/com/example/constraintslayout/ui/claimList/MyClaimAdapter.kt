package com.example.constraintslayout.ui.claimList

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R

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
            itemView.setOnClickListener {
                clickListener(position)
            }
        }

    }


}