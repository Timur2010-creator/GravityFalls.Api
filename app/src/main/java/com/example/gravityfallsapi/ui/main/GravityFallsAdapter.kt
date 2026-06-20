package com.example.gravityfallsapi.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gravityfallsapi.data.model.GravityFallsCharacter
import com.example.gravityfallsapi.databinding.ItemGravityFallsBinding

class GravityFallsAdapter(
    private val onClick: (GravityFallsCharacter) -> Unit
): RecyclerView.Adapter<GravityFallsAdapter.ViewHolder>() {

    private var list = emptyList<GravityFallsCharacter>()

    inner class ViewHolder(val binding: ItemGravityFallsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): com.example.gravityfallsapi.ui.main.GravityFallsAdapter.ViewHolder {
        val binding = ItemGravityFallsBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: com.example.gravityfallsapi.ui.main.GravityFallsAdapter.ViewHolder, position: Int) {
        val character = list[position]
        holder.binding.name.text = (character.name)
        holder.itemView.setOnClickListener { onClick(character) }
    }

    override fun getItemCount() = list.size
}