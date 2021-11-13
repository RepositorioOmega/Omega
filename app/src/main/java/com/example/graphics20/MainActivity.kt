package com.example.graphics20

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.graphics20.databinding.ActivityMainBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://cdni.rt.com/actualidad/public_images/2020.12/article/5fca5d9259bf5b658320aeb1.jpg"))
        list.add(CarouselItem("https://supermamaspanama.com/wp-content/uploads/2019/06/restaurante-1.jpg"))
        list.add(CarouselItem("https://media-cdn.tripadvisor.com/media/photo-s/11/e1/06/24/cornelia.jpg"))
        carousel.addData(list)

    }
}