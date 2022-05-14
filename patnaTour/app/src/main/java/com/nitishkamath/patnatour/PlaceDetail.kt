package com.nitishkamath.patnatour

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_place_detail.*

class PlaceDetail : AppCompatActivity() {
    private lateinit var obj: tourData
    private var image: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_place_detail)
        window.decorView.apply {
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
        }

        obj = intent.getParcelableExtra("myVisitingPlaceList")!!
        image = intent.getIntExtra("image", -1)
        setData(obj, image!!)

    }

    private fun setData(obj: tourData, image: Int) {

        title_pd.text = obj.title
        distance_pd.text = obj.distance
        rating_pd.text = obj.rating
        info_pd.text = obj.info
        overview_pd.text = obj.overView
        image_pd.setImageResource(image)


    }
}