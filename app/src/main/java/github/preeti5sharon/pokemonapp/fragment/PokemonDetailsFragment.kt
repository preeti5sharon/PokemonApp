package github.preeti5sharon.pokemonapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import coil.load
import dagger.hilt.android.AndroidEntryPoint
import github.preeti5sharon.pokemonapp.R
import github.preeti5sharon.pokemonapp.calcDominantColor
import github.preeti5sharon.pokemonapp.databinding.FragmentPokemonDetailsBinding
import github.preeti5sharon.pokemonapp.viewmodel.PokemonDetailsViewModel

@AndroidEntryPoint
class PokemonDetailsFragment : Fragment() {
    private var binding: FragmentPokemonDetailsBinding? = null
    private val viewModel: PokemonDetailsViewModel by viewModels()
    private val navArgs: PokemonDetailsFragmentArgs by navArgs()
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
        requireActivity().actionBar?.setDisplayShowHomeEnabled(true)
        viewModel.getPokemonDetails(navArgs.index)
        viewModel.pokemonDetailsData.observe(viewLifecycleOwner) {
            binding?.imageView?.load(
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/${navArgs.index}.png"
            ) {
                crossfade(true)
//            placeholder(R.drawable.image)
//            transformations(CircleCropTransformation())
                listener { request, result ->
                    val color = calcDominantColor(result.drawable)
                    color?.let { it1 -> binding?.root?.setBackgroundColor(it1) }
                }
            }
            binding?.textView?.text = it.name?.capitalize()
            binding?.textViewHeight?.text = getString(R.string.height, it.height?.times(10))
            binding?.textViewWeight?.text = getString(R.string.weight, it.weight?.div(10))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}
