package com.example.navigationcompex

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcompex.databinding.FragmentGameoverBinding

class GameOverFragment: Fragment(R.layout.fragment_gameover){

    private lateinit var binding:FragmentGameoverBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameoverBinding.bind(view)
        binding.tryAgainView.setOnClickListener{
            view.findNavController().navigate(R.id.action_gameOverFragment_to_gameFragment)
        }
    }
}