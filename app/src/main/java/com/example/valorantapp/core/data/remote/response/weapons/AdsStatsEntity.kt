package com.example.valorantapp.core.data.remote.response.weapons

import com.google.gson.annotations.SerializedName

data class AdsStatsEntity(
    @SerializedName("zoomMultiplier")
    val zoomMultiplier: Double,

    @SerializedName("fireRate")
    val fireRate: Double,

    @SerializedName("runSpeedMultiplier")
    val runSpeedMultiplier: Double,

    @SerializedName("burstCount")
    val burstCount: Long,

    @SerializedName("firstBulletAccuracy")
    val firstBulletAccuracy: Double,
)