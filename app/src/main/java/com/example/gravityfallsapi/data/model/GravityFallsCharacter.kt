package com.example.gravityfallsapi.data.model

data class GravityFallsCharacter(
    val id: Int,
    val name: String,
    val status: String, // - Жив/мертв/неизвестно
    val species: String, // - Человек/существо
    val gender: String,
    val image: String, // - Прямая ссылка на картинку персонажа
    val personality: String
)

