package com.example.valorantapp.data.entities.weapons

import com.google.gson.annotations.SerializedName

data class GridPositionEntity(
    @SerializedName("row")
    val row: Long,

    @SerializedName("column")
    val column: Long,
)