package github.preeti5sharon.pokemonapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import github.preeti5sharon.pokemonapp.databinding.PokemonListItemBinding

class PokemonListAdapter :
    PagingDataAdapter<PokemonItemResult, RecyclerView.ViewHolder>(PokemonListDiffer()) {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = PokemonListItemBinding.bind(holder.itemView)
        val item = getItem(position)
        binding.textView.text = item?.name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.pokemon_list_item, parent, false)
        return PokemonListViewHolder(view)
    }

    class PokemonListDiffer : DiffUtil.ItemCallback<PokemonItemResult>() {
        override fun areItemsTheSame(
            oldItem: PokemonItemResult,
            newItem: PokemonItemResult
        ): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(
            oldItem: PokemonItemResult,
            newItem: PokemonItemResult
        ): Boolean {
            return oldItem.name == newItem.name
        }
    }

    inner class PokemonListViewHolder(view: View) : RecyclerView.ViewHolder(view)
}