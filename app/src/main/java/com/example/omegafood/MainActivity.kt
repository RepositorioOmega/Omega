package com.example.omegafood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val foodplaces = listOf(
        FoodPlace(
            "Perro mono",
            "Calle 13",
            "Comida costena",
            "https://dea154aeb528bee620f5-799733fd03b9298a9f65fee6178f3d08.ssl.cf1.rackcdn.com/pix_3_106230_243253287_5d238e801915a.jpg"
        ),
        FoodPlace(
            "Korean Flavor",
            "Carrera 3",
            "Asiatica",
            "https://www.yaamava.com/sites/default/files/2021-09/Hong_Bao_1080x1080_4_0.jpg"
        ),
        FoodPlace(
            "Punto BG",
            "calle 19-3",
            "Rapida",
            "https://10619-2.s.cdn12.com/rests/original/104_510062021.jpg"
        ),
        FoodPlace(
            "Perro mono",
            "Calle 13",
            "Comida costena",
            "https://dea154aeb528bee620f5-799733fd03b9298a9f65fee6178f3d08.ssl.cf1.rackcdn.com/pix_3_106230_243253287_5d238e801915a.jpg"
        ),
        FoodPlace(
            "Korean Flavor",
            "Carrera 3",
            "Asiatica",
            "https://www.yaamava.com/sites/default/files/2021-09/Hong_Bao_1080x1080_4_0.jpg"
        ),
        FoodPlace(
            "Punto BG",
            "calle 19-3",
            "Rapida",
            "https://10619-2.s.cdn12.com/rests/original/104_510062021.jpg"
        ),
        FoodPlace(
            "Perro mono",
            "Calle 13",
            "Comida costena",
            "https://dea154aeb528bee620f5-799733fd03b9298a9f65fee6178f3d08.ssl.cf1.rackcdn.com/pix_3_106230_243253287_5d238e801915a.jpg"
        ),
        FoodPlace(
            "Korean Flavor",
            "Carrera 3",
            "Asiatica",
            "https://www.yaamava.com/sites/default/files/2021-09/Hong_Bao_1080x1080_4_0.jpg"
        ),
        FoodPlace(
            "Punto BG",
            "calle 19-3",
            "Rapida",
            "https://10619-2.s.cdn12.com/rests/original/104_510062021.jpg"
        ),
        FoodPlace(
            "Perro mono",
            "Calle 13",
            "Comida costena",
            "https://dea154aeb528bee620f5-799733fd03b9298a9f65fee6178f3d08.ssl.cf1.rackcdn.com/pix_3_106230_243253287_5d238e801915a.jpg"
        ),
        FoodPlace(
            "Korean Flavor",
            "Carrera 3",
            "Asiatica",
            "https://www.yaamava.com/sites/default/files/2021-09/Hong_Bao_1080x1080_4_0.jpg"
        ),
        FoodPlace(
            "Punto BG",
            "calle 19-3",
            "Rapida",
            "https://10619-2.s.cdn12.com/rests/original/104_510062021.jpg"
        ),

        )
    private lateinit var pAdapter: PlaceAdapter
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    fun initRecycler() {
        rvFoodPlace.layoutManager = LinearLayoutManager(this)
        val adapter = PlaceAdapter(foodplaces)
        rvFoodPlace.adapter = adapter
    }
}