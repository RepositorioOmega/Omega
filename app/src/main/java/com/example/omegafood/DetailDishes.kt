package com.example.omegafood
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.omegafood.databinding.DetailDishesBinding


class DetailDishes : AppCompatActivity() {

    private lateinit var binding: DetailDishesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DetailDishesBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}