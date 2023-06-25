package com.flaxstudio.wallpaperapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.flaxstudio.wallpaperapp.R
import com.flaxstudio.wallpaperapp.databinding.FragmentAccountBinding

class AccountFragment : Fragment() {
   private lateinit var binding: FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentAccountBinding.inflate(inflater , container , false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.liveWallpapper.setOnClickListener { Toast.makeText(requireContext(),"Clicked Live",Toast.LENGTH_LONG).show() }
        binding.friend.setOnClickListener { Toast.makeText(requireContext(),"Clicked Friend",Toast.LENGTH_LONG).show() }
        binding.feedback.setOnClickListener { Toast.makeText(requireContext(),"Clicked feedback",Toast.LENGTH_LONG).show() }
        binding.helpCenter.setOnClickListener { Toast.makeText(requireContext(),"Clicked help",Toast.LENGTH_LONG).show() }
        binding.about.setOnClickListener { Toast.makeText(requireContext(),"Clicked about",Toast.LENGTH_LONG).show() }
    }

}