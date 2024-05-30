package com.example.valorantapp.data.repository.agents

import com.example.valorantapp.data.datasource.remote.AgentsRemoteDataSource
import com.example.valorantapp.data.mapper.agents.toAgentListModel
import com.example.valorantapp.domain.model.agents.AgentModel
import com.example.valorantapp.domain.repository.AgentsRepository

class AgentsRepositoryImpl(
    private val dataSource: AgentsRemoteDataSource
) : AgentsRepository {

    override suspend fun getAgents(): List<AgentModel> {
        val response = dataSource.getAgents()

        // Transformando a responsta da api em um model
        return response.toAgentListModel()
    }
}