package com.example.bqj.sport_capacity.base

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

abstract class BaseFragment<V : ViewDataBinding, VM : BaseViewModel> : Fragment(), IBaseActivity {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewObservable()
        initData()

    }

    /**
     * 初始化根布局
     *
     * @return 布局layout的id
     */
    abstract fun initContentView(): Int

    /**
     * 初始化ViewModel的id
     *
     * @return BR的id
     */
    abstract fun initVariableId(): Int

    /**
     * 初始化ViewModel
     *
     * @return 继承BaseViewModel的ViewModel
     */
    abstract fun initViewModel(): VM


    /**
     * 初始化界面传递参数
     */
    override fun initParam() {

    }

    /**
     * 初始化数据
     */
    override fun initData() {

    }

    /**
     *初始化界面观察者的监听
     */
    override fun initViewObservable() {

    }


}