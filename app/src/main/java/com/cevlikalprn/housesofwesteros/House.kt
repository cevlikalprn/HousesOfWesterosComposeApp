package com.cevlikalprn.housesofwesteros

data class House(
    val houseId: Int,
    val houseName: String,
    val houseWords: String,
    val housePicture: String,
    val houseHistory: String
)

fun getHouse(houseId: Int): House {
    val house = Constants.houseList.first { house ->
        houseId == house.houseId
    }
    return house
}





