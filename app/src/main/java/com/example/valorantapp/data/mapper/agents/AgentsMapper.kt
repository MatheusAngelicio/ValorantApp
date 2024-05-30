package com.example.valorantapp.data.mapper.agents

import com.example.valorantapp.data.response.agents.AgentListResponse
import com.example.valorantapp.domain.model.agents.AgentModel

fun AgentListResponse.toAgentListModel(): List<AgentModel> {
    return this.root.data.map { agentData ->
        AgentModel(
            uuid = agentData.uuid,
            displayName = agentData.displayName,
            description = agentData.description
        )
    }
}