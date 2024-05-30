package com.example.valorantapp.domain.usecase

import com.example.valorantapp.core.utils.ResultData
import com.example.valorantapp.domain.model.agents.AgentModel
import kotlinx.coroutines.flow.Flow

interface GetAgentsUsecase {
    operator fun invoke(): Flow<ResultData<List<AgentModel>>>
}