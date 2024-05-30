package com.example.valorantapp.core.data.remote.response.weapons

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