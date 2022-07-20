package com.dehaatis.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dehaatis.R
import com.dehaatis.databinding.ActivityLoginSignUpBinding
import com.dehaatis.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
   lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentLoginBinding.inflate(inflater,container,false)
  binding.btnLogin.setOnClickListener{
    findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)
  }

        return binding.root
    }

}