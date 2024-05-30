package com.example.valorantapp.data.response.entities.weapons

import com.google.gson.annotations.SerializedName

data class AltShotgunStatsEntity(
    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Long,

    @SerializedName("burstRate")
    val burstRate: Double,
)