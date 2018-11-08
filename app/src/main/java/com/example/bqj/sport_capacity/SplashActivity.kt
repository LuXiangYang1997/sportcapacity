package com.example.bqj.sport_capacity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity(){

    val SKIP : Int = 0

    val handler : Handler = object :Handler(){
        override fun handleMessage(msg: Message?) {
            super.handleMessage(msg)

            val intent = Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_layout)

        startHomeActivity()

    }

    /**
     * 发送Handler三秒跳转到首页
     */
    private fun startHomeActivity() {

        handler.sendEmptyMessageDelayed(SKIP,3000)

    }


}