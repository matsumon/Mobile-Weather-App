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
        val weatherObject1= Weather(
            day = "24",
            month = "Feb",
            blueTemp = "80",
            redTemp = "96",
            description ="Cloudy",
            rain = "80% precip"
        )
        val weatherObject2= Weather(
            day = "30",
            month = "Jan",
            blueTemp = "54",
            redTemp = "99",
            description ="Cloudy with Meatballs",
            rain = "100% precip"
        )
        val weatherObject3= Weather(
            day = "28",
            month = "Dec",
            blueTemp = "10",
            redTemp = "91",
            description ="Snowing with Hail",
            rain = "99% precip"
        )
        val weatherObject4= Weather(
            day = "15",
            month = "Mar",
            blueTemp = "40",
            redTemp = "55",
            description ="Sunny",
            rain = "28% precip"
        )
        val weatherObject5= Weather(
            day = "13",
            month = "April",
            blueTemp = "67",
            redTemp = "77",
            description ="Cloudy and Drizzling",
            rain = "90% precip"
        )
        val weatherObject6= Weather(
            day = "11",
            month = "Aug",
            blueTemp = "33",
            redTemp = "77",
            description ="Cloudy and Raining",
            rain = "98% precip"
        )
        val weatherObject7= Weather(
            day = "22",
            month = "Oct",
            blueTemp = "23",
            redTemp = "24",
            description ="Sunny with some clouds",
            rain = "45% precip"
        )
        val weatherObject8= Weather(
            day = "11",
            month = "Nov",
            blueTemp = "35",
            redTemp = "36",
            description ="Freezing Rain",
            rain = "80% precip"
        )
        val weatherObject9= Weather(
            day = "16",
            month = "Sep",
            blueTemp = "44",
            redTemp = "76",
            description ="Sunny with a small hurricane",
            rain = "20% precip"
        )
        val weatherObject10= Weather(
            day = "17",
            month = "Jun",
            blueTemp = "61",
            redTemp = "66",
            description ="Blistering Heat",
            rain = "20% precip"
        )
        val weatherObject11= Weather(
            day = "31",
            month = "Jul",
            blueTemp = "98",
            redTemp = "99",
            description ="Hurricane of fire, bring hotdogs",
            rain = "10% precip"
        )
        val weatherObject12= Weather(
            day = "11",
            month = "Aug",
            blueTemp = "95",
            redTemp = "99",
            description ="Floods",
            rain = "100% precip"
        )
        adapter.forecast.add(0 ,weatherObject1)
        adapter.forecast.add(0 ,weatherObject2)
        adapter.forecast.add(0 ,weatherObject3)
        adapter.forecast.add(0 ,weatherObject4)
        adapter.forecast.add(0 ,weatherObject5)
        adapter.forecast.add(0 ,weatherObject6)
        adapter.forecast.add(0 ,weatherObject7)
        adapter.forecast.add(0 ,weatherObject8)
        adapter.forecast.add(0 ,weatherObject9)
        adapter.forecast.add(0 ,weatherObject10)
        adapter.forecast.add(0 ,weatherObject11)
        adapter.forecast.add(0 ,weatherObject12)
        rv.adapter = adapter


    }
}