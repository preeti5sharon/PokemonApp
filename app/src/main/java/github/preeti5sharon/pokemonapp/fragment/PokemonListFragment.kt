package github.preeti5sharon.pokemonapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import github.preeti5sharon.pokemonapp.databinding.FragmentPokemonListBinding
import github.preeti5sharon.pokemonapp.paging.PokemonListAdapter
import github.preeti5sharon.pokemonapp.viewmodel.PokemonListViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PokemonListFragment : Fragment() {
    private var _binding: FragmentPokemonListBinding? = null
    private val viewModel: PokemonListViewModel by viewModels()
    private val pokemonListAdapter = PokemonListAdapter()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPokemonListBinding.inflate(layoutInflater)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pokemonListAdapter.onClick = {
            findNavController().navigate(
                PokemonListFragmentDirections.actionPokemonListFragmentToPokemonDetailsFragment(it)
            )
        }
        _binding?.recyclerView?.adapter = pokemonListAdapter
        lifecycleScope.launch() {
            viewModel.getPokemonList().collectLatest {
                pokemonListAdapter.submitData(it)
            }
        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
