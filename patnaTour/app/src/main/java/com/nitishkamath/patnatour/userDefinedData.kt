package com.nitishkamath.patnatour

import android.os.Parcel
import android.os.Parcelable


data class userDefinedData(
    var make: String?,
    var model: String?,
    var condition: String?,
    var engineCylinder: String?,
    var year: String?,
    var numberOfDoors: String?,
    var price: String?,
    var color: String?,
    var dateSold: String?


) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(make)
        parcel.writeString(model)
        parcel.writeString(condition)
        parcel.writeString(engineCylinder)
        parcel.writeString(year)
        parcel.writeString(numberOfDoors)
        parcel.writeString(price)
        parcel.writeString(color)
        parcel.writeString(dateSold)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<userDefinedData> {
        override fun createFromParcel(parcel: Parcel): userDefinedData {
            return userDefinedData(parcel)
        }

        override fun newArray(size: Int): Array<userDefinedData?> {
            return arrayOfNulls(size)
        }
    }

}
