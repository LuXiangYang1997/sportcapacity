package com.example.bqj.sport_capacity

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View
import com.example.bqj.sport_capacity.databinding.ActivityMainBinding
import com.example.bqj.sport_capacity.ui.discover.view.DiscoverFragment
import com.example.bqj.sport_capacity.ui.matchapply.view.MatchApplyFragment
import com.example.bqj.sport_capacity.ui.matchgrade.view.MatchGradeFragment
import com.example.bqj.sport_capacity.ui.pcenter.view.PCenterFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var binding: ActivityMainBinding ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

        tabState(0)
    }

    /**
     * 初始化
     */
    private fun init() {

        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val matchapplyFragment = MatchApplyFragment()
        val matchGradeFragment = MatchGradeFragment()
        val discoverFragment = DiscoverFragment()
        val pCenterFragment = PCenterFragment()

        val fragmentList : List<Fragment>  = listOf(matchapplyFragment,matchGradeFragment,discoverFragment,pCenterFragment)

        val viewPagerAdapter = ViewPagerAdapter(this.supportFragmentManager,fragmentList)

        vp_home.adapter=viewPagerAdapter

        vp_home.currentItem=0

    }


    /**
     * 底部tab点击事件
     */
    override fun onClick(view: View?) {

        when (view?.id) {
            R.id.ll_match_apply -> tabState(0)
            R.id.ll_match_score -> tabState(1)
            R.id.ll_discover -> tabState(2)
            R.id.ll_personalcenter -> tabState(3)
        }

    }

    /**
     * tab状态的改变
     */

    fun tabState(tabState: Int) {

        when (tabState) {
            0 -> {

                img_match_apply.setImageResource(R.mipmap.icon_match_apply_select)
                tv_match_apply.setTextColor(resources.getColor (R.color.color_FF8F00))
                img_match_grade.setImageResource(R.mipmap.icon_match_grade_unselect)
                tv_match_grade.setTextColor(resources.getColor (R.color.color_333333))
                img_discover.setImageResource(R.mipmap.icon_discover_unselect)
                tv_discover.setTextColor(resources.getColor (R.color.color_333333))
                img_pcenter.setImageResource(R.mipmap.icon_pcenter_unselect)
                tv_pcenter.setTextColor(resources.getColor (R.color.color_333333))
            }

            1 -> {

                img_match_apply.setImageResource(R.mipmap.icon_match_apply_unselect)
                tv_match_apply.setTextColor(resources.getColor (R.color.color_FF8F00))
                img_match_grade.setImageResource(R.mipmap.icon_match_grade_select)
                tv_match_grade.setTextColor(resources.getColor (R.color.color_333333))
                img_discover.setImageResource(R.mipmap.icon_discover_unselect)
                tv_discover.setTextColor(resources.getColor (R.color.color_333333))
                img_pcenter.setImageResource(R.mipmap.icon_pcenter_unselect)
                tv_pcenter.setTextColor(resources.getColor (R.color.color_333333))
            }

            2 -> {

                img_match_apply.setImageResource(R.mipmap.icon_match_apply_unselect)
                tv_match_apply.setTextColor(resources.getColor (R.color.color_FF8F00))
                img_match_grade.setImageResource(R.mipmap.icon_match_grade_unselect)
                tv_match_grade.setTextColor(resources.getColor (R.color.color_333333))
                img_discover.setImageResource(R.mipmap.icon_discover_select)
                tv_discover.setTextColor(resources.getColor (R.color.color_333333))
                img_pcenter.setImageResource(R.mipmap.icon_pcenter_unselect)
                tv_pcenter.setTextColor(resources.getColor (R.color.color_333333))
            }

            3 -> {

                img_match_apply.setImageResource(R.mipmap.icon_match_apply_unselect)
                tv_match_apply.setTextColor(resources.getColor (R.color.color_FF8F00))
                img_match_grade.setImageResource(R.mipmap.icon_match_grade_unselect)
                tv_match_grade.setTextColor(resources.getColor (R.color.color_333333))
                img_discover.setImageResource(R.mipmap.icon_discover_unselect)
                tv_discover.setTextColor(resources.getColor (R.color.color_333333))
                img_pcenter.setImageResource(R.mipmap.icon_pcenter_select)
                tv_pcenter.setTextColor(resources.getColor (R.color.color_333333))


            }

        }


    }

}



