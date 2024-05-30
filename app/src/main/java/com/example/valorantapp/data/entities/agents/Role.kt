package com.example.valorantapp.data.entities.agents

import com.google.gson.annotations.SerializedName

data class RoleEntity(
    @SerializedName("uuid")
    val uuid: String,

    @SerializedName("displayName")
    val displayName: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("displayIcon")
    val displayIcon: String,

    @SerializedName("assetPath")
    val assetPath: String,
)