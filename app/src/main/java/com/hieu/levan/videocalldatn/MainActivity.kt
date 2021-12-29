package com.hieu.levan.videocalldatn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.hieu.levan.videocalldatn.databinding.ActivityMainBinding
import java.net.ServerSocket

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main).apply {
            btnLogin.setOnClickListener { e ->

            }
            lifecycleOwner = this@MainActivity
        }
    }
}