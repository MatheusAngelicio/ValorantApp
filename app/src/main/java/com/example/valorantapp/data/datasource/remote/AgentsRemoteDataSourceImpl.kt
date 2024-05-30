package com.example.valorantapp.data.datasource.remote

import com.example.valorantapp.data.response.agents.AgentListResponse
import com.example.valorantapp.data.service.ValorantService
import javax.inject.Inject

class AgentsRemoteDataSourceImpl @Inject constructor(
    private val service: ValorantService
) : AgentsRemoteDataSource {

    override suspend fun getAgents(): AgentListResponse {
        return service.getAgentList(isPlayableCharacter = true)
    }
}