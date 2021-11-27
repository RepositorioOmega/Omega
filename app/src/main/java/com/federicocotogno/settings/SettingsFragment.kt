package com.federicocotogno.settings

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.preference.PreferenceFragmentCompat

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)

        Toast.makeText(context, "Ingresaste a configuraciones", Toast.LENGTH_SHORT).show()
    }

}