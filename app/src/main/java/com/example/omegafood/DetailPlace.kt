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
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEhHlO-U6OJUej6BZ6dSfu_Ea7rxpvM3PQXX0ClPpd-X-HJO76tYDBzsEMC44Rx6KWtVt_8ukgIgjy0YyJ12NfvXCqEbg8MX-PbJtal7mdd5FJKP_pQFA3ecqWYTxBirTM1bOxhVo7Jv1JJEnqN8bVPcHyOxK8jkXXkWg0Cg4u4p_y_aOz1YOAy_26xN9g=s320"))
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEjgWofmsbsb2djfDiVycXx7RzDR2Gn6FF2RkU3ruTDeIoUW9YZjc9ne1ByupuCXkq-5bcyuAdYOrjkMnCJlIwWHndpkhGWq9neutoGGdKjd4K9p1rlxEGg5NrGKuL7JwS7y8Tmdw40wK-v6Cuio3GMgltReW-xX3IQW3YFDFapSc433eVCXREzG28hL2g=s320"))
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEj2xCTRZ7_TKGMtc1C5r96YCfVZwJ7Npyj5IKQhlgT0p_DHEltDMs0l4bVDF874APUIcN7Ft_iMkfsldc4pWyZYJLY_ajEwnul3ReFIe10qotQOZtnxwPRVOx1PBHqyALoQkQIwCmW5BeLIPdCpx0UeAn6hfPlATU7BHsDEw9UxU_8oinmhG9fzwv4JvQ=s320"))
        list.add(CarouselItem("https://blogger.googleusercontent.com/img/a/AVvXsEj08qprxBmoDYegtodCDZhvaQgCUs9GWSJjgKeLLu3C6pg3cZl991KshnOvBKWOPzENuMrNkF9dhItLP9UDwYEvsE4eAooDKu_3mFw42O8Vdz59ANZ7j51SSevkfSN3uh9QEZbjGRDI52h151DzZJWUpuSUAJBL6HzxygwRof3TntbCMDX0yvOWH6QdJw=s320"))
        carousel.addData(list)
    }
}