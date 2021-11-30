package com.mintic.omegafood

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.fragment_activity_main)
//    }

//
//        recycler = findViewById(R.id.food_list)
//        setupRecyclerView()
//        generatePlaceFood()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    /**
     * Sets up the RecyclerView: empty data set, item dividers, swipe to delete.
     */
//    private fun setupRecyclerView() {
//        mFoodPlaces = arrayListOf()
//        recycler.addItemDecoration(
//            DividerItemDecoration(
//                this,
//                DividerItemDecoration.VERTICAL
//            )
//        )
//        mAdapter = PlaceAdapter(mFoodPlaces, this) { foodPlace ->
//            contactOnClick(foodPlace)
//        }
//
//        recycler.adapter = mAdapter
//    }
//
//    /* RecyclerView item is clicked. */
//    private fun contactOnClick(foodPlace: FoodPlace) {
//        Log.d(TAG, "Click on: $foodPlace")
//        foodPlace?.let {
//            navigateToDetail(it)
//        }
//    }
//
//    private fun navigateToDetail(foodPlace: FoodPlace) {
//        val intent = Intent(this, DetailActivity::class.java)
//        startActivity(intent)
//            //.apply {
////            putExtra(KEY_NAME, foodPlace.PlaceName)
////            putExtra(KEY_LAST_NAME, foodPlace.Adress)
////            putExtra(KEY_CONTACT, foodPlace)
//        }
//
//        //startActivity(intent)
////    }
//
//    /**
//     * Generates mock contact data to populate the UI from a JSON file in the
//     * assets directory, called from the options menu.
//     */
//    private fun generatePlaceFood() {
//        val placesString = readPlaceJsonFile()
//        try {
//            val placesJson = JSONArray(placesString)
//            for (i in 0 until placesJson.length()) {
//                val placeJson = placesJson.getJSONObject(i)
//                val foodPlace = FoodPlace(
//                    placeJson.getString("place_name"),
//                    placeJson.getString("adress"),
//                    placeJson.getString("email"),
//                    placeJson.getString("imageUrl")
//                )
//                Log.d(TAG, "generatePlaceFood: $foodPlace")
//                mFoodPlaces.add(foodPlace)
//            }
//
//            mAdapter.notifyDataSetChanged()
//        } catch (e: JSONException) {
//            e.printStackTrace()
//        }
//    }
//
//    /**
//     * Reads a file from the assets directory and returns it as a string.
//     *
//     * @return The resulting string.
//     */
//    private fun readPlaceJsonFile(): String? {
//        var placesString: String? = null
//        try {
//            val inputStream = assets.open("mock_placefood.json")
//            val size = inputStream.available()
//            val buffer = ByteArray(size)
//            inputStream.read(buffer)
//            inputStream.close()
//
//            placesString = String(buffer)
//        } catch (e: IOException) {
//            e.printStackTrace()
//        }
//
//        return placesString
//    }
//
//
//    companion object {
//        private val TAG = MainActivity::class.java.simpleName
//        const val KEY_NAME = "contact_extra_name"
//        const val KEY_LAST_NAME = "contact_extra_last_name"
//        const val KEY_CONTACT = "contact_extra"
//    }




}
