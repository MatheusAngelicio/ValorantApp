package com.example.valorantapp.data.response.entities.weapons

import com.google.gson.annotations.SerializedName

data class SkinEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("themeUuid")
    val themeUuid: String,

    @SerializedName("contentTierUuid")
    val contentTierUuid: String?,

    @SerializedName("displayIcon")
    val displayIcon: String?,

    @SerializedName("wallpaper")
    val wallpaper: String?,

    @SerializedName("assetPath")
    val assetPath: String,

    @SerializedName("chromas")
    val chromas: List<ChromaEntity>,

    @SerializedName("levels")
    val levels: List<LevelEntity>,
)