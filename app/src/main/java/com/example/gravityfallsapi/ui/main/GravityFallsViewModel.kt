package com.example.gravityfallsapi.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gravityfallsapi.data.network.RetrofitClient
import kotlinx.coroutines.launch

class GravityFallsViewModel : ViewModel() {

    fun fetchCharacters() {
        viewModelScope.launch {
            try {
                // Вызов функции с круглыми скобками
                val response = RetrofitClient.apiService.getAllCharacters()
                Log.d("API_SUCCESS", "Fetched ${response.size} characters")
            } catch (e: Exception) {
                Log.e("API_ERROR", "Error fetching data: ${e.message}")
            }
        }
    }
}
