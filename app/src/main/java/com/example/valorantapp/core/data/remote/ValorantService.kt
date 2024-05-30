package com.example.valorantapp.core.data.remote

import com.example.valorantapp.core.data.remote.response.agents.AgentListResponse
import com.example.valorantapp.core.data.remote.response.weapons.WeaponListResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ValorantService {

    @GET("agents")
    suspend fun getAgentList(
        @Query("isPlayableCharacter") isPlayableCharacter: Boolean
    ) : AgentListResponse

    @GET("weapons")
    suspend fun getWeaponList() : WeaponListResponse
}