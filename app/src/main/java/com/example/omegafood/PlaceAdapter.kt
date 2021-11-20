package com.example.omegafood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import java.util.ArrayList


class PlaceAdapter(
    private val mFoodPlaces: ArrayList<FoodPlace>,
    private val context: Context,
    private val onClick: (FoodPlace) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceFoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceFoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.formatplace, parent, false)
        return PlaceFoodViewHolder(view)
    }

    override fun onBindViewHolder(holderPlaceFood: PlaceFoodViewHolder, position: Int) {
        val foodPlace = mFoodPlaces[position]
        holderPlaceFood.bind(foodPlace = foodPlace)
    }

    override fun getItemCount(): Int {
        return mFoodPlaces.size
    }

    inner class PlaceFoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var nameLabel: TextView = itemView.findViewById(R.id.textview_name)
        private var adressLabel: TextView = itemView.findViewById(R.id.tvAdress)
        private var emailLabel: TextView = itemView.findViewById(R.id.textview_email)
        private var imageView: ImageView = itemView.findViewById(R.id.imageview_thumb)
        private var currentFoodPlace: FoodPlace? = null

        init {
            itemView.setOnClickListener {
                currentFoodPlace?.let {
                    onClick(it)
                }
            }
        }

        /* Bind Contact name and image. */
        fun bind(foodPlace: FoodPlace) {
            currentFoodPlace = foodPlace

            //val fullName = "${foodPlace.PlaceName} ${foodPlace.Adress}"
            adressLabel.text = foodPlace.Adress
            nameLabel.text = foodPlace.PlaceName
            emailLabel.text = foodPlace.Email

            Glide.with(context)
                .load(foodPlace.ImgUrl)
                .into(imageView)
        }
    }
}


