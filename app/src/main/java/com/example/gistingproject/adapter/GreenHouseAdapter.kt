package com.example.gistingproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gistingproject.R
import com.example.gistingproject.user.ListGreenHouse

class GreenHouseAdapter(var listStudent : ArrayList<ListGreenHouse>): RecyclerView.Adapter<GreenHouseAdapter.ViewHolder>(){
    class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
        var nameGreenHouse = view.findViewById<TextView>(R.id.tvNamaSensor)
        var imgGreenHouse = view.findViewById<ImageView>(R.id.ivGreenHouse)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GreenHouseAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_greenhouse, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: GreenHouseAdapter.ViewHolder, position: Int) {
        holder.nameGreenHouse.text = listStudent[position].nameGreenHouse
        holder.imgGreenHouse.setImageResource(listStudent[position].imgGreenHouse)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}