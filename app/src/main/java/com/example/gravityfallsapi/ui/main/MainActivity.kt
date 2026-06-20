package com.example.gravityfallsapi.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.gravityfallsapi.databinding.ItemGravityFallsBinding
import com.example.gravityfallsapi.ui.details.DetailActivity
import kotlin.getValue
import kotlin.jvm.java

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ItemGravityFallsBinding
    private val viewModel: GravityFallsViewModel by viewModels()
    private lateinit var adapter: GravityFallsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ItemGravityFallsBinding.inflate(layoutInflater) //Активируем Binding
        setContentView(binding.root)

        adapter = GravityFallsAdapter {
                character ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", character.name)
            intent.putExtra("image", character.image)
            intent.putExtra("species", character.species)
            intent.putExtra("status", character.status)
            startActivity(intent)
        }


        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter
    }
}