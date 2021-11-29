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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [list.newInstance] factory method to
 * create an instance of this fragment.
 */
class list : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment list.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            list().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}


class List : AppCompatActivity() {

    private lateinit var mFoodPlaces: ArrayList<FoodPlace>
    private lateinit var mAdapter: PlaceAdapter
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_activity_main)

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