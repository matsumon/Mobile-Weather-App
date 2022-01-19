package com.example.android.basicweather

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView


class WeatherAdapter: RecyclerView.Adapter<WeatherAdapter.ViewHolder>() {
    val forecast: MutableList<Weather> = mutableListOf()
    override fun getItemCount() = this.forecast.size
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.resource_layout, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.bind(this.forecast[position])
    }
    inner class ViewHolder(view:View): RecyclerView.ViewHolder(view) {
        var day: TextView = view.findViewById(R.id.day)
        var month: TextView = view.findViewById(R.id.month)
        var blueTemp: TextView = view.findViewById(R.id.blueTemp)
        var redTemp: TextView = view.findViewById(R.id.redTemp)
        var description: TextView = view.findViewById(R.id.description)
        var rain: TextView = view.findViewById(R.id.rain)

        fun bind(item: Weather) {
            this.day.text = item.day
            this.month.text = item.month
            this.blueTemp.text = item.blueTemp
            this.redTemp.text = item.redTemp
            this.description.text = item.description
            this.rain.text = item.rain
        }
    }
}