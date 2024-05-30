package com.example.valorantapp.core.data.remote.response.agents

import com.google.gson.annotations.SerializedName

data class AgentDataEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("developerName")
    val developerName: String,

    @SerializedName("characterTags")
    val characterTags: List<String>?,

    @SerializedName("displayIcon")
    val displayIcon: String,

    @SerializedName("displayIconSmall")
    val displayIconSmall: String,

    @SerializedName("bustPortrait")
    val bustPortrait: String?,

    @SerializedName("fullPortrait")
    val fullPortrait: String?,

    @SerializedName("fullPortraitV2")
    val fullPortraitV2: String?,

    @SerializedName("killfeedPortrait")
    val killfeedPortrait: String,

    @SerializedName("background")
    val background: String?,

    @SerializedName("backgroundGradientColors")
    val backgroundGradientColors: List<String>,

    @SerializedName("assetPath")
    val assetPath: String,

    @SerializedName("isFullPortraitRightFacing")
    val isFullPortraitRightFacing: Boolean,

    @SerializedName("isPlayableCharacter")
    val isPlayableCharacter: Boolean,

    @SerializedName("isAvailableForTest")
    val isAvailableForTest: Boolean,

    @SerializedName("isBaseContent")
    val isBaseContent: Boolean,

    @SerializedName("role")
    val role: RoleEntity?,

    @SerializedName("recruitmentData")
    val recruitmentData: RecruitmentDataEntity?,

    @SerializedName("abilities")
    val abilities: List<AbilityEntity>,

    @SerializedName("voiceLine")
    val voiceLine: Any?,
)
