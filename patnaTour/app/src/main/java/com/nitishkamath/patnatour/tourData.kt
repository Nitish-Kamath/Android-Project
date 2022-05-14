package com.nitishkamath.patnatour

import android.os.Parcel
import android.os.Parcelable


data class tourData(
    val id: Int?,
    val title: String?,
    val info: String?,
    val rating: String?,
    val distance: String?,
    val overView: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(info)
        parcel.writeString(rating)
        parcel.writeString(distance)
        parcel.writeString(overView)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<tourData> {
        override fun createFromParcel(parcel: Parcel): tourData {
            return tourData(parcel)
        }

        override fun newArray(size: Int): Array<tourData?> {
            return arrayOfNulls(size)
        }
    }

}