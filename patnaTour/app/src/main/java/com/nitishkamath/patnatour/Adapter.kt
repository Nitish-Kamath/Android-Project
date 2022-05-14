package com.nitishkamath.patnatour


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view.view.*

// myVisitingPlaceList is a list of data of type PlanetData.
class Adapter(var myVisitingPlaceList: List<tourData>) :
    RecyclerView.Adapter<Adapter.myViewHolder>() {

    class myViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var image = view.ivImage!!
        var title = view.tvTitle
        var info = view.tvInfo
        var rating = view.tvRating
        var distance = view.tvDistance

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

        holder.title.text = myVisitingPlaceList[position].title
        holder.info.text = myVisitingPlaceList[position].info
        holder.rating.text = myVisitingPlaceList[position].rating
        holder.distance.text = myVisitingPlaceList[position].distance

        when (myVisitingPlaceList[position].title!!) {
            "Buddha Smriti Park" -> {
                dummyImage = R.drawable.buddhapark
            }
            "Patna Planetrium" -> {
                dummyImage = R.drawable.taramandal
            }
            "Takht Sri Patna Sahib" -> {
                dummyImage = R.drawable.gwara
            }
            "Bihar Museum" -> {
                dummyImage = R.drawable.bmuseum
            }
            "Eco Park" -> {
                dummyImage = R.drawable.ecopark
            }
            "Sanjay Gandhi Botanical Garden" -> {
                dummyImage = R.drawable.zoo
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



