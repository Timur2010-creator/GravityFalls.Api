package com.example.gravityfallsapi.ui.details

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.gravityfallsapi.R
import com.example.gravityfallsapi.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) { //Активируем Binding
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Если будет какая-то ошибка с их данными,то заеняем на эти 👇
        val name = intent.getStringExtra("name") ?: "Без имени"
        val age = intent.getStringExtra("age") ?: "Без возраста"
        val species = intent.getStringExtra("species") ?: "Без определения"
        val status = intent.getStringExtra("status") ?: "Без статуса"
        val gender = intent.getStringExtra("gender") ?: "Без гендера"

        //👇Эти коды будут призывать на экране имена,оружия и цвет персонажей
        binding.name.text = name
        binding.age.text = "Возраст: $age"
        binding.species.text = "Определение: $species"
        binding.status.text = "Статус: $status"
        binding.gender.text = "Гендер: $gender"

    }
}