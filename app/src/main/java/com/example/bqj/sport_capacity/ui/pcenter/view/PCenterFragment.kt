package com.example.bqj.sport_capacity.ui.pcenter.view

import com.example.bqj.sport_capacity.R
import com.example.bqj.sport_capacity.base.BaseFragment
import com.example.bqj.sport_capacity.databinding.PcenterLayoutBinding
import com.example.bqj.sport_capacity.ui.pcenter.vm.PcenterVm

class PCenterFragment : BaseFragment<PcenterLayoutBinding,PcenterVm>() {


    override fun initContentView(): Int {

        return R.layout.pcenter_layout
    }

    override fun initVariableId(): Int {

        return 0
    }

    override fun initViewModel(): PcenterVm {

        val pcenterVm = PcenterVm()

        return pcenterVm
    }


}