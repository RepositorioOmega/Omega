package com.mintic.omegafood

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.json.JSONArray
import org.json.JSONException
import java.io.IOException
import java.util.ArrayList


class Listing : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }



class List : AppCompatActivity() {

    private lateinit var mFoodPlaces: ArrayList<FoodPlace>
    private lateinit var mAdapter: PlaceAdapter
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_list)

        recycler = findViewById(R.id.food_list)
        setupRecyclerView()
        generatePlaceFood()

    }

    /**
     * Sets up the RecyclerView: empty data set, item dividers, swipe to delete.
     */
    private fun setupRecyclerView() {
        mFoodPlaces = arrayListOf()
        recycler.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )


        mAdapter = PlaceAdapter(mFoodPlaces, this) { foodPlace ->
            contactOnClick(foodPlace)
        }

        recycler.adapter = mAdapter
    }

    /* RecyclerView item is clicked. */
    private fun contactOnClick(foodPlace: FoodPlace) {
        Log.d(TAG, "Click on: $foodPlace")
        foodPlace?.let {
            navigateToDetail(it)
        }
    }

    private fun navigateToDetail(foodPlace: FoodPlace) {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
        //.apply {
//            putExtra(KEY_NAME, foodPlace.PlaceName)
//            putExtra(KEY_LAST_NAME, foodPlace.Adress)
//            putExtra(KEY_CONTACT, foodPlace)
    }

    //startActivity(intent)
//    }

    /**
     * Generates mock contact data to populate the UI from a JSON file in the
     * assets directory, called from the options menu.
     */
    private fun generatePlaceFood() {
        val placesString = readPlaceJsonFile()
        try {
            val placesJson = JSONArray(placesString)
            for (i in 0 until placesJson.length()) {
                val placeJson = placesJson.getJSONObject(i)
                val foodPlace = FoodPlace(
                    placeJson.getString("place_name"),
                    placeJson.getString("adress"),
                    placeJson.getString("email"),
                    placeJson.getString("imageUrl")
                )
                Log.d(TAG, "generatePlaceFood: $foodPlace")
                mFoodPlaces.add(foodPlace)
            }

            mAdapter.notifyDataSetChanged()
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    /**
     * Reads a file from the assets directory and returns it as a string.
     *
     * @return The resulting string.
     */
    private fun readPlaceJsonFile(): String? {
        var placesString: String? = null
        try {
            val inputStream = assets.open("mock_placefood.json")
            val size = inputStream.available()
            val buffer = ByteArray(size)
            inputStream.read(buffer)
            inputStream.close()

            placesString = String(buffer)
        } catch (e: IOException) {
            e.printStackTrace()
        }

        return placesString
    }


    companion object {
        private val TAG = List::class.java.simpleName
//        const val KEY_NAME = "contact_extra_name"
//        const val KEY_LAST_NAME = "contact_extra_last_name"
//        const val KEY_CONTACT = "contact_extra"
    }
}
}