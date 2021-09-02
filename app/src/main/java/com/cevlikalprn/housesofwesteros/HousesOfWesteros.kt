package com.cevlikalprn.housesofwesteros

import java.util.ArrayList

data class HousesOfWesteros(
    val houseId: Int,
    val houseName: String,
    val houseWords: String,
    val housePicture: String
)

fun getHouse(houseId: Int): HousesOfWesteros {
    val house = Constants.houseList.first { house ->
        houseId == house.houseId
    }
    return house
}





