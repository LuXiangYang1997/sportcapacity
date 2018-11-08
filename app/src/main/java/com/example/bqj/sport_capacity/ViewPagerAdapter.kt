package com.example.bqj.sport_capacity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager,fragmentList: List<Fragment>) : FragmentPagerAdapter(fm){

    var fragmentList = fragmentList


    override fun getItem(position: Int): Fragment {
        return fragmentList.get(position)



    }

    override fun getCount(): Int {

        return fragmentList.size
    }


}