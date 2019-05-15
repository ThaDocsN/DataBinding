package com.thadocizn.databinding

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.thadocizn.databinding.databinding.ActivityMainBinding
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.user = UserData("Charles Johnson", "Wrote this")

        val handlers = MainActivityClickHandlers(this)
        binding.clickHandler = handlers

    }

    class MainActivityClickHandlers(val context: Context){
        fun onEnroll(view: View){context.toast("This is a test")}
        fun onCancel(view: View) {context.toast("This is test 2")}
    }
}
