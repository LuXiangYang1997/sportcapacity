package com.example.bqj.sport_capacity.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.example.bqj.sport_capacity.R
import com.example.bqj.sport_capacity.databinding.ToolbarLayoutBinding

abstract class BaseFragment<V : ViewDataBinding, VM : BaseViewModel> : Fragment(), IBaseActivity {

    var binding: V? = null
    var viewModel: VM? = null
    var toolbarBinding: ToolbarLayoutBinding? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater!!, initContentView(), container, false)
        viewModel = initViewModel()
        binding!!.setVariable(initVariableId(), viewModel)

        return binding!!.getRoot()
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewDaraBinding()
        initViewObservable()
        initData()

    }

    /**
     * 注入绑定
     */
    private fun initViewDaraBinding() {
        binding = DataBindingUtil.setContentView<V>(this.activity, initContentView())
        viewModel = initViewModel()
        binding!!.setVariable(initVariableId(), viewModel)
        val rootView = binding!!.root
        if (rootView is LinearLayout) {
            val toolbarView = LayoutInflater.from(this.activity).inflate(R.layout.toolbar_layout, null)
            rootView.addView(toolbarView, 0)
            toolbarBinding = DataBindingUtil.bind<ToolbarLayoutBinding>(toolbarView)
        }
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