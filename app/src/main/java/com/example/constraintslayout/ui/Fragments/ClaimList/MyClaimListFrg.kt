package com.example.constraintslayout.ui.Fragments.ClaimList

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.*
import com.example.constraintslayout.*
import com.example.constraintslayout.ui.Activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_my_claim_list.*


class MyClaimListFrg : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* variable *********************
    // ==================================================================================//

    var modelArray  =  Array<MyClaimModel>(0){ MyClaimModel("puneet")
    }

    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_my_claim_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        setUpToolBar()
        initialization()
        setUpRecyclerView()
    }

    override fun onResume()
    {
        super.onResume()
        (activity as HomeActivity).hideBottomNav(false)
    }



    // ==================================================================================//
    // MARK: ********************* Default  Navigation Bar Method *********************
    // ==================================================================================//

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {

        inflater?.inflate(R.menu.my_claim_navigation_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId)
        {
            R.id.claim_filter ->
            {
                print("Menu Clicked :: $item?.itemId")


            }

        }
        return super.onOptionsItemSelected(item)
    }


    // ==================================================================================//
    // MARK: ********************* Listener *********************
    // ==================================================================================//

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

    // ==================================================================================//
    // MARK: ********************* Private Method *********************
    // ==================================================================================//

    fun setUpToolBar()
    {

    }

    private fun initialization()
    {
        modelArray   = Array(20) { MyClaimModel("puneet") }
    }

    private fun setUpRecyclerView()
    {
        my_claim_recycler.layoutManager      = LinearLayoutManager(this.context)
        this.my_claim_recycler.adapter       = MyClaimAdapter(modelArray, { position: Int -> itemClicked(position) })
    }


}
