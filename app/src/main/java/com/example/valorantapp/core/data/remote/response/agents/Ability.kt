package com.example.valorantapp.core.data.remote.response.agents

import com.google.gson.annotations.SerializedName

data class AbilityEntity(
    @SerializedName("slot")
    val slot: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("displayIcon")
    val displayIcon: String?,
)