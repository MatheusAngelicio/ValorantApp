package com.example.valorantapp.data.service

import com.example.valorantapp.data.response.agents.AgentListResponse
import com.example.valorantapp.data.response.weapons.WeaponListResponse
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