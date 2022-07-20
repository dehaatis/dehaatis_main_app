package com.dehaatis.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dehaatis.R
import com.dehaatis.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

lateinit var binding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentSignUpBinding.inflate(inflater,container,false)
  binding.btnSignup.setOnClickListener{
      findNavController().navigate(R.id.action_signUpFragment_to_loginFragment)
  }
        return binding.root
    }

}