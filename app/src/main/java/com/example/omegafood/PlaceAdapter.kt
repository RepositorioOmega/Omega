package com.example.omegafood

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.formatplace.view.*

class PlaceAdapter(val foodplace: List<FoodPlace>) :
    RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PlaceHolder(layoutInflater.inflate(R.layout.formatplace, parent, false))
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.render(foodplace[position])
    }

    override fun getItemCount(): Int = foodplace.size

    class PlaceHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun render(foodplace: FoodPlace) {
            view.tvNamePlace.text = foodplace.PlaceName
            view.tvDesc1place.text = foodplace.Description1
            view.tvAdress.text = foodplace.Adress
            Picasso.get().load(foodplace.ImgUrl).into(view.ivPlace)
        }
    }
}