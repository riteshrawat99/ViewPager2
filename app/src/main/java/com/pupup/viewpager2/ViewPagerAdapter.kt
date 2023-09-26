package com.pupup.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {  // inherit FragmentPagerAdapter
     val fragment : MutableList<Fragment> = arrayListOf() // create a fragment arrayListOf to store mutlitple fragment
//     val tittle : MutableList<String> = arrayListOf() // create a tittle variable to store tab tittle

    override fun getCount(): Int {
        return fragment.size // return how much fragment
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position] // find fragment position
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return null
            }
            1 -> {
                return "Tab 2"
            }
            2 -> {
                return "Tab 3"
            }
            3 -> {
                return "Tab 4"
            }
        }
        return super.getPageTitle(position)
    }

}