package com.example.navigationcompex

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcompex.databinding.FragmentMainBinding

class MainFragment: Fragment(R.layout.fragment_main) {

    private lateinit var binding:FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.playButton.setOnClickListener{
            val playerName = binding.nameInputLayout.editText?.text.toString()
            view.findNavController().navigate(MainFragmentDirections.actionMainFragmentToGameFragment(playerName))
        }

    }
}