package com.example.googlemapsandroidapiexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mapFragment =supportFragmentManager.findFragmentById(R.id.fragment_map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap =googleMap

        val seoul =LatLng(37.56, 126.97)
        mMap.addMarker(MarkerOptions().position(seoul).title("서울").snippet("한국의 수도"))

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(seoul,10.0f))

        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(seoul,10.0f))


    }


}
