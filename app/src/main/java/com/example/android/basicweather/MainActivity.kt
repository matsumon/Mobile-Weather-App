package com.example.android.basicweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv = findViewById<RecyclerView>(R.id.main)
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)
        val adapter = WeatherAdapter()
        val weatherObject= Weather( day = "24"
            , month = "Feb"
            , blueTemp = "80"
            , redTemp = "96"
            , description ="Cloudy With a Chance of Meatballs"
            , rain = "80% precip")
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        adapter.forecast.add(0 ,weatherObject)
        rv.adapter = adapter


    }
}