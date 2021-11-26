package com.example.pruebafrag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController






class HomeFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding.settingsButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_homeFragment_to_settingsFragment)
        }

        return inflater.inflate(R.layout.fragment_home, container, false)

    }





    }



