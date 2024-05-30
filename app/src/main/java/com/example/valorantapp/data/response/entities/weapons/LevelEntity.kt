package com.example.valorantapp.data.response.entities.weapons

import com.google.gson.annotations.SerializedName

data class LevelEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("levelItem")
    val levelItem: String?,

    @SerializedName("displayIcon")
    val displayIcon: String?,

    @SerializedName("streamedVideo")
    val streamedVideo: String?,

    @SerializedName("assetPath")
    val assetPath: String,
)
