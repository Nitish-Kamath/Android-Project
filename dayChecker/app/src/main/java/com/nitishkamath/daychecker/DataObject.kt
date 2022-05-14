package com.nitishkamath.daychecker

object DataObject {
    var listData = mutableListOf<CardInfo>()
    fun setData(day: String, status: String) {
        listData.add(CardInfo(day, status))
    }

    fun getAllData(): List<CardInfo> {
        return listData

    }
}
