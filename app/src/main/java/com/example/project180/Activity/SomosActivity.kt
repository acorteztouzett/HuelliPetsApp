package com.example.project180.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project180.R
import com.example.project180.databinding.ActivityIntroBinding
import com.example.project180.databinding.ActivityMapsBinding
import com.example.project180.databinding.ActivitySomosBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class SomosActivity : BaseActivity() {
    private lateinit var binding:ActivitySomosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySomosBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
