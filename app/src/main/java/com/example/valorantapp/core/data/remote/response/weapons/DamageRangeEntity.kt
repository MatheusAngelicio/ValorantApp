package com.example.valorantapp.core.data.remote.response.weapons

import com.google.gson.annotations.SerializedName

data class DamageRangeEntity(
    @SerializedName("rangeStartMeters")
    val rangeStartMeters: Long,

    @SerializedName("rangeEndMeters")
    val rangeEndMeters: Long,

    @SerializedName("headDamage")
    val headDamage: Double,

    @SerializedName("bodyDamage")
    val bodyDamage: Long,

    @SerializedName("legDamage")
    val legDamage: Double,
)
