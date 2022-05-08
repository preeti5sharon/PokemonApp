package github.preeti5sharon.pokemonapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import github.preeti5sharon.pokemonapp.databinding.FragmentPokemonDetailsBinding

@AndroidEntryPoint
class PokemonDetailsFragment : Fragment() {
    private var binding: FragmentPokemonDetailsBinding? = null
    private val viewModel: PokemonDetailsViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPokemonDetailsBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPokemonDetails()
        viewModel.pokemonDetailsData.observe(viewLifecycleOwner) {
            Log.w("Pokemon", "$it")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}