package com.example.valorantapp.data.response.entities.weapons

import com.example.valorantapp.data.response.entities.weapons.WeaponDataEntity
import com.google.gson.annotations.SerializedName

data class WeaponRootEntity(
    @SerializedName("status")
    val status: Long,

    @SerializedName("data")
    val data: List<WeaponDataEntity>,
)