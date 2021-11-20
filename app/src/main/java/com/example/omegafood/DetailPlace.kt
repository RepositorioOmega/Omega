package com.example.omegafood
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.omegafood.databinding.DetailPlaceBinding
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class DetailPlace : AppCompatActivity() {

    private val list = mutableListOf<CarouselItem>()

    private lateinit var binding: DetailPlaceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DetailPlaceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val carousel: ImageCarousel = findViewById(R.id.carousel)
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEgukXJnUPZIOXr3ksR44Qx5iiZktsttEoJp6Dk0QpbQo_Md3Al8ZxTbthbEST4je6iia-jSeJQgOQ9rDJ3UyRnBr91vtp2Ks7502tL_r8aeX8Ueb_ecMRLwxWiaCDPXmxeuHMrFPYwoJCdiwXqPyKgy2PQBdGA06YbSBsU1UYaxQHhB5a2iMWlbeIB3Jg=s320"))
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEiey1RNE6yf4fXdociCZg019Z86JC0sPgmA8SZcIcoWgsTUkQjFeFScGNeYk_lgmfGq_8sBXhZ5QuFCmbC-Zx1YGc_zCe-mgufDZp6yz4q-PGqSYUhOAe_9bINsNIQH__JzOh741TdNcCltnN5xg0-ZJnyJIhPxLcGtnkp1w_Z8Q88JJOYF1Y5bI4_RMg=s320"))
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEgjAlajaE4pN037CfVTiR66g6nnnExcteC1r8jqPkTh3ybmViy1bt8fVtWfr9c5EkFXc4xkrDNr7krhTDJ9LSc0Hj1588t86-Nym8GqpR5qd8hpToszkfDbZBxXGYDaSEmM6l0uq1J7HKEOsPGS5_VoWA3xNjYQsUGJrhG0ZY_B-F8FxYwUXzBZ1Rvg0w=s320"))
        carousel.addData(list)
    }
}