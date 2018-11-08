package com.example.bqj.sport_capacity.ui.matchgrade.view

import com.example.bqj.sport_capacity.R
import com.example.bqj.sport_capacity.base.BaseFragment
import com.example.bqj.sport_capacity.databinding.MatchGradeLayoutBinding
import com.example.bqj.sport_capacity.ui.matchgrade.vm.MatchGradeVm

class MatchGradeFragment : BaseFragment<MatchGradeLayoutBinding, MatchGradeVm>(){
    override fun initContentView(): Int {

        return R.layout.match_grade_layout
    }

    override fun initVariableId(): Int {

        return 0
    }

    override fun initViewModel(): MatchGradeVm {

        val matchGradeVm = MatchGradeVm()

        return matchGradeVm
    }
}