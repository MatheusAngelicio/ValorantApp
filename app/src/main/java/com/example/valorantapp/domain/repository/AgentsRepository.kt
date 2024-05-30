package com.example.valorantapp.domain.repository

import com.example.valorantapp.domain.model.agents.AgentModel

interface AgentsRepository {

    suspend fun getAgents(): List<AgentModel>

}