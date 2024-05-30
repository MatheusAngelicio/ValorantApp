package com.example.valorantapp.data.entities.weapons

import com.google.gson.annotations.SerializedName

data class WeaponDataEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("category")
    val category: String,

    @SerializedName("defaultSkinUuid")
    val defaultSkinUuid: String,

    @SerializedName("displayIcon")
    val displayIcon: String,

    @SerializedName("killStreamIcon")
    val killStreamIcon: String,

    @SerializedName("assetPath")
    val assetPath: String,

    @SerializedName("weaponStats")
    val weaponStats: WeaponStatsEntity?,

    @SerializedName("shopData")
    val shopData: ShopDataEntity?,

    @SerializedName("skins")
    val skins: List<SkinEntity>,
)