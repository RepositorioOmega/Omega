package com.sdascension.traveller.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PoiViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is poi Fragment"
    }
    val text: LiveData<String> = _text

}