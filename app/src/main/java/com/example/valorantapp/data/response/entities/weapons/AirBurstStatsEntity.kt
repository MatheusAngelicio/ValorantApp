package com.example.valorantapp.data.response.entities.weapons

import com.google.gson.annotations.SerializedName

data class AirBurstStatsEntity(
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Long,

    @SerializedName("burstDistance")
    val burstDistance: Double,
)