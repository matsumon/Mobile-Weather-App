package com.example.android.basicweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
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
            blueTemp = "80°F",
            redTemp = "96°F",
            description ="Cloudy",
            rain = "80% precip",
            long_description = "Cloudy with low of 80 and high of 96 and 80% chance of rain."
        )
        val weatherObject2= Weather(
            day = "30",
            month = "Jan",
            blueTemp = "54°F",
            redTemp = "99°F",
            description ="Cloudy with Meatballs",
            rain = "99% precip",
            long_description = "Cloudy with Meatballs with low of 54 and high of 99 and 99% chance of rain."
        )
        val weatherObject3= Weather(
            day = "28",
            month = "Dec",
            blueTemp = "10°F",
            redTemp = "91°F",
            description ="Snowing with Hail",
            rain = "99% precip",
            long_description = "Snowing with Hail with low of 10 and high of 91 and 99% chance of rain."
        )
        val weatherObject4= Weather(
            day = "15",
            month = "Mar",
            blueTemp = "40°F",
            redTemp = "55°F",
            description ="Sunny",
            rain = "28% precip",
            long_description = "Sunny with low of 40 and high of 55 and 28% chance of rain."
        )
        val weatherObject5= Weather(
            day = "13",
            month = "April",
            blueTemp = "67°F",
            redTemp = "77°F",
            description ="Cloudy and Drizzling",
            rain = "90% precip",
            long_description = "Cloudy and Drizzling with low of 67 and high of 77 and 90% chance of rain."
        )
        val weatherObject6= Weather(
            day = "11",
            month = "Aug",
            blueTemp = "33°F",
            redTemp = "77°F",
            description ="Cloudy and Raining",
            rain = "98% precip",
            long_description = "Cloudy and Raining with low of 33 and high of 77 and 98% chance of rain."
        )
        val weatherObject7= Weather(
            day = "22",
            month = "Oct",
            blueTemp = "23°F",
            redTemp = "24°F",
            description ="Sunny with some clouds",
            rain = "45% precip",
            long_description = "Sunny with some clouds with low of 23 and high of 24 and 45% chance of rain."
        )
        val weatherObject8= Weather(
            day = "11",
            month = "Nov",
            blueTemp = "35°F",
            redTemp = "36°F",
            description ="Freezing Rain",
            rain = "80% precip",
            long_description = "Freezing Rain with low of 35 and high of 36 and 80% chance of rain."
        )
        val weatherObject9= Weather(
            day = "16",
            month = "Sep",
            blueTemp = "44°F",
            redTemp = "76°F",
            description ="Sunny with a small hurricane",
            rain = "20% precip",
            long_description = "Sunny with a small hurricane with low of 44 and high of 76 and 20% chance of rain."
        )
        val weatherObject10= Weather(
            day = "17",
            month = "Jun",
            blueTemp = "61°F",
            redTemp = "66°F",
            description ="Blistering Heat",
            rain = "20% precip",
            long_description = "Blistering Heat with low of 61 and high of 66 and 20% chance of rain."
        )
        val weatherObject11= Weather(
            day = "31",
            month = "Jul",
            blueTemp = "98°F",
            redTemp = "99°F",
            description ="Hurricane of fire, bring hotdogs",
            rain = "10% precip",
            long_description = "Hurricane of fire, bring hotdogs with low of 98 and high of 99 and 10% chance of rain."
        )
        val weatherObject12= Weather(
            day = "11",
            month = "Aug",
            blueTemp = "95°F",
            redTemp = "99°F",
            description ="Floods",
            rain = "99% precip",
            long_description = "Floods with low of 95 and high of 99 and 99% chance of rain."
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
//        Dividers that split the cards, below line taken from https://stackoverflow.com/questions/57886100/how-to-add-item-divider-for-recyclerview-in-kotlin
        val decorator = DividerItemDecoration(applicationContext, LinearLayoutManager.VERTICAL)
//        ask TA why this is vertical and not horizontal. Vertical phone orientation?
        rv.addItemDecoration(decorator)

    }
}