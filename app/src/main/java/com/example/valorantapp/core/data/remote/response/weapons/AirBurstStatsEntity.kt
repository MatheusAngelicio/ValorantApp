package com.example.valorantapp.core.data.remote.response.weapons

import com.google.gson.annotations.SerializedName

data class AirBurstStatsEntity(
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Long,

    @SerializedName("burstDistance")
    val burstDistance: Double,
)