package com.example.valorantapp.data.response.entities.weapons

import com.google.gson.annotations.SerializedName

data class ShopDataEntity(
    @SerializedName("cost")
    val cost: Long,

    @SerializedName("category")
    val category: String,

    @SerializedName("shopOrderPriority")
    val shopOrderPriority: Long,

    @SerializedName("categoryText")
    val categoryText: String,

    @SerializedName("gridPosition")
    val gridPosition: GridPositionEntity?,

    @SerializedName("canBeTrashed")
    val canBeTrashed: Boolean,

    @SerializedName("image")
    val image: Any?,

    @SerializedName("newImage")
    val newImage: String,

    @SerializedName("newImage2")
    val newImage2: Any?,

    @SerializedName("assetPath")
    val assetPath: String,
)