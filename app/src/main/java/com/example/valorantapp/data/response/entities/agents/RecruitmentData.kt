package com.example.valorantapp.data.response.entities.agents

import com.google.gson.annotations.SerializedName

data class RecruitmentDataEntity(
    @SerializedName("counterId")
    val counterId: String,

    @SerializedName("milestoneId")
    val milestoneId: String,

    @SerializedName("milestoneThreshold")
    val milestoneThreshold: Long,

    @SerializedName("useLevelVpCostOverride")
    val useLevelVpCostOverride: Boolean,

    @SerializedName("levelVpCostOverride")
    val levelVpCostOverride: Long,

    @SerializedName("startDate")
    val startDate: String,

    @SerializedName("endDate")
    val endDate: String,
)