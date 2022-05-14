package com.nitishkamath.daychecker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_layout.view.*

class myAdapter(var data: List<CardInfo>) :
    RecyclerView.Adapter<myAdapter.viewHolder>() {

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var day = itemView.day
        var status = itemView.status
        var layout = itemView.layout


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewHolder {


        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.my_layout, parent, false)
        return viewHolder(itemView)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        // data[position].day -> day is from CardInfo.kt
        // holder.day.text -> day is from the same file which is pointing to my_layout.xml file

        holder.day.text = data[position].day
        holder.status.text = data[position].status

    }


    override fun getItemCount(): Int {
        return data.size

    }
}