package com.example.valorantapp.core.data.remote.response.weapons

import com.google.gson.annotations.SerializedName

data class GridPositionEntity(
    @SerializedName("row")
    val row: Long,

    @SerializedName("column")
    val column: Long,
)