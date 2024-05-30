package com.example.valorantapp.data.entities.agents

import com.example.valorantapp.data.entities.agents.AgentDataEntity
import com.google.gson.annotations.SerializedName

data class AgentRootEntity(
    @SerializedName("status")
    val status: Long,

    @SerializedName("data")
    val data: List<AgentDataEntity>,
)