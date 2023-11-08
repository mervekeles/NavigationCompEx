package com.example.navigationcompex

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.navigationcompex.databinding.FragmentGameBinding

class GameFragment:Fragment(R.layout.fragment_game) {
    private lateinit var binding: FragmentGameBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentGameBinding.bind(view)

        val args = GameFragmentArgs.fromBundle(requireArguments())

        val nameToDisplay = getString(R.string.player_name, args.playerName)
        binding.nameView.text = nameToDisplay

        binding.submitButton.setOnClickListener{
            val checkedId = binding.answersRadioGroup.checkedRadioButtonId

            if(checkedId == R.id.radioButton3){
                view.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
            }
            else{
                view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
            }
        }

    }
}