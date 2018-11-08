package com.example.bqj.sport_capacity.ui.discover.view

import com.example.bqj.sport_capacity.R
import com.example.bqj.sport_capacity.base.BaseFragment
import com.example.bqj.sport_capacity.databinding.DiscoverLayoutBinding
import com.example.bqj.sport_capacity.ui.discover.vm.DiscoverVm

class DiscoverFragment :BaseFragment<DiscoverLayoutBinding,DiscoverVm>(){
    override fun initContentView(): Int {

        return R.layout.discover_layout
    }

    override fun initVariableId(): Int {

        return 0;
    }

    override fun initViewModel(): DiscoverVm {

        val discoverVm = DiscoverVm()
        return discoverVm
    }

    override fun initViewObservable() {
        super.initViewObservable()

    }

}