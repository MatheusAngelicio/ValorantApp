package com.example.valorantapp.core.data.remote.response.agents

import com.google.gson.annotations.SerializedName

data class AgentRootEntity(
    @SerializedName("status")
    val status: Long,

    @SerializedName("data")
    val data: List<AgentDataEntity>,
)