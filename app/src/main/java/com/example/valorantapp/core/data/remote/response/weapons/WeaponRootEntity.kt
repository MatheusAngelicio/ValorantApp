package com.example.valorantapp.core.data.remote.response.weapons

import com.google.gson.annotations.SerializedName

data class WeaponRootEntity(
    @SerializedName("status")
    val status: Long,

    @SerializedName("data")
    val data: List<WeaponDataEntity>,
)