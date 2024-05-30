package com.example.valorantapp.data.response.entities.agents

import com.google.gson.annotations.SerializedName

data class AgentRootEntity(
    @SerializedName("status")
    val status: Long,

    @SerializedName("data")
    val data: List<AgentDataEntity>,
)