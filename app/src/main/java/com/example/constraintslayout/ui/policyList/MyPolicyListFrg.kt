package com.example.constraintslayout.ui.policyList


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.constraintslayout.R
import com.example.constraintslayout.ui.homeActivity.HomeActivity
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
        this.my_policy_recycler.adapter       = MyPolicyAdapter(modelArray, { position: Int -> itemClicked(position) })

    }

    override fun onResume() {
        super.onResume()
        (activity as HomeActivity).hideBottomNav(false)
    }


    fun itemClicked(position:Int)
    {
        print("Item Clicked at position :: $position")

        /*val fragment = ClaimDetailsFrg()
        (activity as HomeActivity).addFragment(fragment,"")
        (activity as HomeActivity).hideBottomNav(true)*/

        //val host = NavHostFragment.create(R.navigation.bottom_navigation)
        //fragmentManager?.beginTransaction()?.replace(R.id.home_activity_container, host)?.setPrimaryNavigationFragment(host)?.commit()

        /*val action =  R.id.action_navigation_my_claims_to_claimDetailsFrg()
        action.setNameToShow("AAAAAA123456")
        findNavController().navigate(action)*/


        //Navigation.createNavigateOnClickListener( R.id.action_navigation_my_claims_to_claimDetailsFrg, null)





    }

}
