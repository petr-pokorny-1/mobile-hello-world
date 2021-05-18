package com.maptiler.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mapbox.mapboxsdk.Mapbox
import com.mapbox.mapboxsdk.maps.MapView

class MainActivity : AppCompatActivity() {

    private var mapView: MapView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get the MapBox context
        Mapbox.getInstance(this, null)

        // Inflate the view
        setContentView(R.layout.activity_main)

        // Create map view
        mapView = findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync { map ->
            map.uiSettings.isAttributionEnabled = false
            map.uiSettings.isLogoEnabled = false
            // Set the style after mapView was loaded
            map.setStyle("https://demotiles.maplibre.org/style.json")
        }
    }
}