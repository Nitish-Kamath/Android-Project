package com.nitishkamath.patnatour


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

// myVisitingPlaceList is a list of data of type PlanetData.
class Adapter(var myVisitingPlaceList: List<userDefinedData>) :
    RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image = view.ivImage!!
        var make = view.tvMake!!
        var model = view.tvModel!!
        var rating = view.tvRating!!
        var year = view.tvYear!!

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, PlaceDetail::class.java)

            intent.putExtra("myVisitingPlaceList", myVisitingPlaceList[position])
            intent.putExtra("image", dummyImage)
            holder.itemView.context.startActivity(intent)

        }

        holder.make.text = myVisitingPlaceList[position].make
        holder.model.text = myVisitingPlaceList[position].model
        holder.rating.text = myVisitingPlaceList[position].condition
        holder.year.text = myVisitingPlaceList[position].year

        when (myVisitingPlaceList[position].model!!) {
            "Maruti Alto K10" -> {
                dummyImage = R.drawable.alto
            }
            "Hyundai i20" -> {
                dummyImage = R.drawable.hyundi
            }
            "Mercedes-Benz GLE" -> {
                dummyImage = R.drawable.merbenz
            }
            "Tata Punch" -> {
                dummyImage = R.drawable.punch
            }
            "Renault Kiger RXL" -> {
                dummyImage = R.drawable.reanault
            }
            "Mahindra Thar" -> {
                dummyImage = R.drawable.thar
            }
            "Tata Tiago Ev" -> {
                dummyImage = R.drawable.tiago
            }

            "Toyota Fortuner" -> {
                dummyImage = R.drawable.toyota
            }
            "Volkswagen Virtus" -> {
                dummyImage = R.drawable.volkswagen
            }
            "Maruti Baleno" -> {
                dummyImage = R.drawable.marutibaleno
            }


        }
        if (dummyImage != null) {
            holder.image.setImageResource(dummyImage!!)
        } else {
            Toast.makeText(holder.itemView.context, "image Pls", Toast.LENGTH_SHORT).show()
        }


    }

    override fun getItemCount(): Int {
        return myVisitingPlaceList.size
    }
}



