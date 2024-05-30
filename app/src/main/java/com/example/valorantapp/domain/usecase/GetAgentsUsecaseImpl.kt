package com.example.valorantapp.domain.usecase

import com.example.valorantapp.core.utils.ResultData
import com.example.valorantapp.domain.model.agents.AgentModel
import com.example.valorantapp.domain.repository.AgentsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class GetAgentsUsecaseImpl @Inject constructor(
    private val repository: AgentsRepository
) : GetAgentsUsecase {
    override fun invoke(): Flow<ResultData<List<AgentModel>>> {
        return flow {
            emit(ResultData.Loading)
            val agents = repository.getAgents()
            emit(ResultData.Success(agents))
        }.flowOn(Dispatchers.IO)
            .catch { e ->
                emit(ResultData.handleException(e))
            }
    }
}