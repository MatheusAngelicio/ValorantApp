package com.example.valorantapp.data.response.entities.weapons

import com.example.valorantapp.data.response.entities.weapons.AdsStatsEntity
import com.example.valorantapp.data.response.entities.weapons.AirBurstStatsEntity
import com.example.valorantapp.data.response.entities.weapons.AltShotgunStatsEntity
import com.example.valorantapp.data.response.entities.weapons.DamageRangeEntity
import com.google.gson.annotations.SerializedName

data class WeaponStatsEntity(
    @SerializedName("fireRate")
    val fireRate: Double,

    @SerializedName("magazineSize")
    val magazineSize: Long,

    @SerializedName("runSpeedMultiplier")
    val runSpeedMultiplier: Double,

    @SerializedName("equipTimeSeconds")
    val equipTimeSeconds: Double,

    @SerializedName("reloadTimeSeconds")
    val reloadTimeSeconds: Double,

    @SerializedName("firstBulletAccuracy")
    val firstBulletAccuracy: Double,

    @SerializedName("shotgunPelletCount")
    val shotgunPelletCount: Long,

    @SerializedName("wallPenetration")
    val wallPenetration: String,

    @SerializedName("feature")
    val feature: String?,

    @SerializedName("fireMode")
    val fireMode: String?,

    @SerializedName("altFireType")
    val altFireType: String?,

    @SerializedName("adsStats")
    val adsStats: AdsStatsEntity?,

    @SerializedName("altShotgunStats")
    val altShotgunStats: AltShotgunStatsEntity?,

    @SerializedName("airBurstStats")
    val airBurstStats: AirBurstStatsEntity?,

    @SerializedName("damageRanges")
    val damageRanges: List<DamageRangeEntity>,
)