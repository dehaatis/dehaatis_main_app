package com.dehaatis.ui.activity

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.dehaatis.R
import com.dehaatis.databinding.ActivityLoginSignUpBinding

class LoginSignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginSignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_login_sign_up)




    }
}