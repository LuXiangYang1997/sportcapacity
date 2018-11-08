package com.example.bqj.sport_capacity.ui.matchapply.view

import android.view.View
import com.example.bqj.sport_capacity.R
import com.example.bqj.sport_capacity.base.BaseFragment
import com.example.bqj.sport_capacity.databinding.MatchApplyLayoutBinding
import com.example.bqj.sport_capacity.ui.matchapply.vm.MatchApplyVm

class MatchApplyFragment : BaseFragment<MatchApplyLayoutBinding,MatchApplyVm>(){
    override fun initContentView(): Int {

        return R.layout.match_apply_layout
    }

    override fun initVariableId(): Int {

        return 0
    }

    override fun initViewModel(): MatchApplyVm {


        val matchApplyVm = MatchApplyVm()

        return matchApplyVm
    }

    override fun initViewObservable() {
        super.initViewObservable()
        toolbarBinding!!.toolbar.visibility=View.VISIBLE


    }

}