package com.example.valorantapp.data.datasource.remote

import com.example.valorantapp.data.response.agents.AgentListResponse

interface AgentsRemoteDataSource {

    suspend fun getAgents(): AgentListResponse
}