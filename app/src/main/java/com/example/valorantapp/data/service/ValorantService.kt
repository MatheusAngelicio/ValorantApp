package com.example.valorantapp.data.service

import retrofit2.http.GET
import retrofit2.http.Query

interface ValorantService {

    @GET("agents")
    suspend fun getAgentList(
        @Query("isPlayableCharacter") isPlayableCharacter: Boolean
    ) : com.example.valorantapp.data.datasource.remote.response.agents.AgentListResponse

    @GET("weapons")
    suspend fun getWeaponList() : com.example.valorantapp.data.datasource.remote.response.weapons.WeaponListResponse
}