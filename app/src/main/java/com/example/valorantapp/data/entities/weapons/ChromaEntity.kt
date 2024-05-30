package com.example.valorantapp.data.entities.weapons

import com.google.gson.annotations.SerializedName

data class ChromaEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("displayIcon")
    val displayIcon: String?,

    @SerializedName("fullRender")
    val fullRender: String,

    @SerializedName("swatch")
    val swatch: String?,

    @SerializedName("streamedVideo")
    val streamedVideo: String?,

    @SerializedName("assetPath")
    val assetPath: String,
)