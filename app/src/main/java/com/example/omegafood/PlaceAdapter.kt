package com.example.omegafood

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_place.view.*

class PlaceAdapter(
    private val foodplace: List<FoodPlace>, private val context: Context,
    private val onClick: (FoodPlace?) -> Unit
) :
    RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val itemview = LayoutInflater.from(parent.context).inflate(R.layout.item_place, parent, false)
        return PlaceHolder(itemview)
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        holder.render(foodplace[position])
    }

    override fun getItemCount(): Int = foodplace.size

   inner class PlaceHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private var currentPlace: FoodPlace? = null

        init {
            view.setOnClickListener {
                Log.d(TAG, "itemView OnClick")
                onClick(currentPlace)
            }
        }

        fun render(foodplace: FoodPlace) {
            currentPlace = foodplace
            view.tvNamePlace.text = foodplace.PlaceName
            view.tvDesc1place.text = foodplace.Description1
            view.tvAdress.text = foodplace.Adress
            Picasso.get().load(foodplace.ImgUrl).into(view.ivPlace)
        }
    }
    companion object{
        private const val TAG = "PlaceAdapter"
    }
}

